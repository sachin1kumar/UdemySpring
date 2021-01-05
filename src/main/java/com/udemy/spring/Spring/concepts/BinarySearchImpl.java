package com.udemy.spring.Spring.concepts;

public class BinarySearchImpl {

    private SearchAlgo searchAlgo;

    public BinarySearchImpl(SearchAlgo searchAlgo) {
        this.searchAlgo = searchAlgo;
    }

    public String performBinarySearch() {
        //This will return type of sorting algo used..
        return searchAlgo.sort();
    }
}
