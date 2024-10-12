package io.datajek.spring.basics.movie_recommender_system.singelton_with_prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilterWithMixTypes implements Filter{

    private static int instance = 0;
    @Autowired
    private Movie movie;

    public ContentBasedFilterWithMixTypes(){
        instance++;
        System.out.println("Content Based filter..");
    }
    @Lookup
    public Movie getMovie(){
        return movie;
    }
    public static int getInstance(){
        return ContentBasedFilterWithMixTypes.instance;
    }

    @Override
    public String[] getRecommendation(String movie) {
        //calculate similarity between movies
        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
