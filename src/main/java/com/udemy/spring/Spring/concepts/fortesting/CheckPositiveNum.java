package com.udemy.spring.Spring.concepts.fortesting;

import java.util.Arrays;

public class CheckPositiveNum {

    private final DataService dataService;

    public CheckPositiveNum(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public boolean isPositive() {
        int[] input = dataService.getData();
        return Arrays.stream(input).iterator().nextInt() > 0;
    }
}
