package io.datajek.spring.basics.movie_recommender_system.recommendation;

public class CollaborativeBasedFilter implements Filter{

    public String[] getRecommendation(String movie){
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
