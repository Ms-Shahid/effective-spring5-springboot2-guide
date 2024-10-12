package io.datajek.spring.basics.movie_recommender_system.springbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

    @Override
    public String[] getRecommendation(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
