package io.datajek.spring.basics.movie_recommender_system.singelton_with_prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {

    private static int instance = 0;
    private int id;
    private String name;
    private String genre;

    public Movie(){
        instance++;
        System.out.println("Movie is being watched");
    }

    public static int getInstance(){
        return Movie.instance;
    }

    public double movieSimilarity(int movie1, int movie2) {

        double similarity = 0.0;

        //if genres are same add 0.3 to similarity
        //if producers are same add 0.5 to similarity

        return similarity;
    }
}
