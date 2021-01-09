package com.udemy.spring.Spring.concepts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadPropertyFile {

    @Value("${service.url}")
    private String url;

    public String getUrl() {
        return url;
    }
}
