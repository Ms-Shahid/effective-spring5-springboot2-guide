package io.datajek.spring.basics.movie_recommender_system.springbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeBasedFilter implements Filter {

    public String[] getRecommendation(String movie){
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
