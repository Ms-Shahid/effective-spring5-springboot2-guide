package io.datajek.spring.basics.movie_recommender_system.recommendation;

public class ContentBasedFilter implements Filter{


    @Override
    public String[] getRecommendation(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
