package io.datajek.spring.basics.movie_recommender_system;

import io.datajek.spring.basics.movie_recommender_system.bean_lifecycle.RecommenderImplPostAndPreConstruct;
import io.datajek.spring.basics.movie_recommender_system.bean_scope.CollaborativeBasedFilterPrototypeScope;
import io.datajek.spring.basics.movie_recommender_system.bean_scope.ContentBasedFilterSingletonScope;
import io.datajek.spring.basics.movie_recommender_system.injection.RecommenderImplementationConstructorBasedInjection;
import io.datajek.spring.basics.movie_recommender_system.injection.RecommenderImplementationSetterBasedInjection;
import io.datajek.spring.basics.movie_recommender_system.singelton_with_prototype.ContentBasedFilterWithMixTypes;
import io.datajek.spring.basics.movie_recommender_system.singelton_with_prototype.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//RecommenderImplementation injects dependency using constructor
		System.out.println("\n*************************************************");
		System.out.println("Calling getBean() on RecommenderImplementationConstructorBasedInjection");
		RecommenderImplementationConstructorBasedInjection recommender = context.getBean(RecommenderImplementationConstructorBasedInjection.class);
		String[] result = recommender.recommendMovies("Avengers Endgame");
		System.out.println(Arrays.toString(result));

//		RecommenderImplementation recommender = context.getBean(RecommenderImplementation.class);
		System.out.println("\n*************************************************");
		System.out.println("Calling getBean() on RecommenderImplementationSetterBasedInjection");
		RecommenderImplementationSetterBasedInjection recommender2 = context.getBean(RecommenderImplementationSetterBasedInjection.class);
		result = recommender2.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

		ContentBasedFilterSingletonScope cbf1 = context.getBean(ContentBasedFilterSingletonScope.class);
		ContentBasedFilterSingletonScope cbf2 = context.getBean(ContentBasedFilterSingletonScope.class);
		ContentBasedFilterSingletonScope cbf3 = context.getBean(ContentBasedFilterSingletonScope.class);

		if( cbf1.equals(cbf2) && cbf1.equals(cbf3) && cbf2.equals(cbf3) ) System.out.println("Singleton bean....");

		CollaborativeBasedFilterPrototypeScope prototypeScope1 = context.getBean(CollaborativeBasedFilterPrototypeScope.class);
		CollaborativeBasedFilterPrototypeScope prototypeScope2 = context.getBean(CollaborativeBasedFilterPrototypeScope.class);
		CollaborativeBasedFilterPrototypeScope prototypeScope3 = context.getBean(CollaborativeBasedFilterPrototypeScope.class);

		if( !prototypeScope1.equals(prototypeScope2) && !prototypeScope1.equals(prototypeScope3) && !prototypeScope2.equals(prototypeScope3))
			System.out.println("Prototype bean...");

		//mixing scopes - singleton & prototype
		//Retrieve and print singleton bean from application context
		ContentBasedFilterWithMixTypes filter = context.getBean(ContentBasedFilterWithMixTypes.class);
		System.out.println("\nContentBasedFilter bean with singleton scope");
		System.out.println(filter);

		//Retrieve and print prototype bean from the singleton bean twice
		Movie movie1 = filter.getMovie();
		Movie movie2 = filter.getMovie();
		Movie movie3 = filter.getMovie();

		System.out.println("\nMovie bean with prototype scope");
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);

		//Print number of instances of each bean
		System.out.println("\nContentBasedFilter instances created: "+ ContentBasedFilterWithMixTypes.getInstance());
		System.out.println("Movie instances created: "+ Movie.getInstance());

		//@PostConstruct
		RecommenderImplPostAndPreConstruct postAndPreConstruct = context.getBean(RecommenderImplPostAndPreConstruct.class);
		System.out.println(postAndPreConstruct);
	}

}
