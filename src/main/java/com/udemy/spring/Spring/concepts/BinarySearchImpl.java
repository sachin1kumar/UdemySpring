package com.udemy.spring.Spring.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SearchAlgo searchAlgo;

    public BinarySearchImpl(SearchAlgo searchAlgo) {
        this.searchAlgo = searchAlgo;
    }

    public String performBinarySearch() {
        //This will return type of sorting algo used..
        return searchAlgo.sort();
    }
}
