package com.udemy.spring.Spring.concepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Loose coupling b/w beans and dependencies.
@Configuration
@ComponentScan("com.udemy.spring.Spring.concepts")
@PropertySource("classpath:application.properties")
public class SpringConceptsApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConceptsApplication.class);

		/*BinarySearchImpl binarySearch = new BinarySearchImpl(new MergeSort());
		System.out.println(binarySearch.performBinarySearch());*/

		//To get Binary search from Spring..
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch.performBinarySearch());

		System.out.println(applicationContext.getBean(ReadPropertyFile.class).getUrl());

		applicationContext.close();
	}

}
