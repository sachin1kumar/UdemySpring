package com.udemy.spring.Spring.concepts;

import org.springframework.stereotype.Component;

@Component
public class MergeSort implements SearchAlgo {
    @Override
    public String sort() {
        return "MergeSort";
    }
}
