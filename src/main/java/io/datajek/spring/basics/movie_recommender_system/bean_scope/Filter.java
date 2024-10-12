package io.datajek.spring.basics.movie_recommender_system.bean_scope;

public interface Filter {

    public String[] getRecommendation(String movie);
}
