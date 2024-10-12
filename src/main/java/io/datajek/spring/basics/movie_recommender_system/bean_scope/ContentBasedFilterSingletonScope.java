package io.datajek.spring.basics.movie_recommender_system.bean_scope;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilterSingletonScope implements Filter {

    @Override
    public String[] getRecommendation(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
