package io.datajek.spring.basics.movie_recommender_system.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
public class RecommenderImplPostAndPreConstruct {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Filter filter;

    @Autowired
    public void setFilter(Filter filter){
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("In RecommenderImplementation postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }


}
