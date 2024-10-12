package io.datajek.spring.basics.movie_recommender_system.injection;

public interface Filter {

    String[] getRecommendation(String movie);
}
