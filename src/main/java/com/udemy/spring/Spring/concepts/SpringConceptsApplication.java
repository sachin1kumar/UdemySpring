package com.udemy.spring.Spring.concepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Loose coupling b/w beans and dependencies.
@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConceptsApplication.class, args);

		/*BinarySearchImpl binarySearch = new BinarySearchImpl(new MergeSort());
		System.out.println(binarySearch.performBinarySearch());*/


	}

}
