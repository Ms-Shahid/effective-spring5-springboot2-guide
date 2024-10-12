package io.datajek.spring.basics.movie_recommender_system.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("contentBasedFilterSetterInjection")
public class ContentBasedFilterInjection implements Filter {

    @Override
    public String[] getRecommendation(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
