package io.datajek.spring.basics.movie_recommender_system.springbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CBF")
    private Filter filter;

    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] movies = filter.getRecommendation(movie);
        return movies;
    }
}
