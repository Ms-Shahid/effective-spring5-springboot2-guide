package io.datajek.spring.basics.movie_recommender_system.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementationConstructorBasedInjection {

    private Filter filter;
    @Autowired
    public RecommenderImplementationConstructorBasedInjection(@Qualifier("collaborativeFilter") Filter filter){
        super();
        this.filter = filter;
        System.out.println("Constructor based injection...");
    }


    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] movies = filter.getRecommendation(movie);
        return movies;
    }
}
