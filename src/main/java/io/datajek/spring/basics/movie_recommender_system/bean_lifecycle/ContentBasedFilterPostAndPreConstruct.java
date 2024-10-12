package io.datajek.spring.basics.movie_recommender_system.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilterPostAndPreConstruct implements Filter{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ContentBasedFilterPostAndPreConstruct(){
        super();
        logger.info("In ContentBasedFilter constructor method");
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("In ContentBasedFilter postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        //clear movies from cache
        logger.info("In ContentBasedFilter preDestroy method");
    }

}
