package com.udemy.spring.Spring.concepts;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MergeSort implements SearchAlgo {
    @Override
    public String sort() {
        return "MergeSort";
    }
}
