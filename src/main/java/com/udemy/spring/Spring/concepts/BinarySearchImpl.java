package com.udemy.spring.Spring.concepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(Logger.class);

    @Autowired
    private SearchAlgo searchAlgo;

   /* Using no setter and no constructor dependency.
   public BinarySearchImpl(SearchAlgo searchAlgo) {
        this.searchAlgo = searchAlgo;
    }*/

    public String performBinarySearch() {
        //This will return type of sorting algo used..
        return searchAlgo.sort();
    }

    @PostConstruct
    public void postConstruct() {
        logger.error("postConstruct called");
    }

    @PreDestroy
    public void PreDestroy() {
        logger.error("PreDestroy called");
    }
}
