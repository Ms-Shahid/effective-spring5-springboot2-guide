package io.datajek.spring.basics.movie_recommender_system.bean_scope;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") //option-1
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //option-2

public class CollaborativeBasedFilterPrototypeScope implements Filter {

    public String[] getRecommendation(String movie){
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
