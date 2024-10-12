package io.datajek.spring.basics.movie_recommender_system.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("collaborativeFilter")
public class CollaborativeBasedFilterInjection implements Filter {

    public String[] getRecommendation(String movie){
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
