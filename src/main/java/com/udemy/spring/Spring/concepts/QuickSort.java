package com.udemy.spring.Spring.concepts;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SearchAlgo {
    @Override
    public String sort() {
        return "QuickSort";
    }
}
