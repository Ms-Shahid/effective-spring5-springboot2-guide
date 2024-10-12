package io.datajek.spring.basics.movie_recommender_system.recommendation;

public class RecommenderImplementation {

    private Filter filter;
    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] movies = filter.getRecommendation(movie);
        return movies;
    }
}
