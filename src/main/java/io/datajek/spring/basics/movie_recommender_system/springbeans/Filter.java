package io.datajek.spring.basics.movie_recommender_system.springbeans;

public interface Filter {

    public String[] getRecommendation(String movie);
}
