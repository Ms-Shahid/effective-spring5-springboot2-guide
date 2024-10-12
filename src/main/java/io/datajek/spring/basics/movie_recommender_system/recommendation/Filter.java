package io.datajek.spring.basics.movie_recommender_system.recommendation;

public interface Filter {

    public String[] getRecommendation(String movie);
}
