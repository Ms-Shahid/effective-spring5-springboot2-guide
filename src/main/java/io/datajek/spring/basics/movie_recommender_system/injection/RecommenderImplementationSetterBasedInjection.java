package io.datajek.spring.basics.movie_recommender_system.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementationSetterBasedInjection {

    private Filter filter;

    @Autowired
    @Qualifier("contentBasedFilterSetterInjection")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter based injection...");
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] movies = filter.getRecommendation(movie);
        return movies;
    }
}
