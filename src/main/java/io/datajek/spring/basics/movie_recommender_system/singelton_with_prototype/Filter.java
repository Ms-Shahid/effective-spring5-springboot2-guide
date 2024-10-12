package io.datajek.spring.basics.movie_recommender_system.singelton_with_prototype;

public interface Filter {
    String[] getRecommendation(String movie);
}
