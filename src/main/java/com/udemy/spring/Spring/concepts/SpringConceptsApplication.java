package com.udemy.spring.Spring.concepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Loose coupling b/w beans and dependencies.
@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringConceptsApplication.class, args);

		/*BinarySearchImpl binarySearch = new BinarySearchImpl(new MergeSort());
		System.out.println(binarySearch.performBinarySearch());*/

		//To get Binary search from Spring..
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch.performBinarySearch());
	}

}
