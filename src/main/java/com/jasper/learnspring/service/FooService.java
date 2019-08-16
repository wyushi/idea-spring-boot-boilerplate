package com.jasper.learnspring.service;

import org.springframework.stereotype.Service;

@Service
public class FooService {

    public FooService() {
        System.out.println("FooService constructed!");
    }

    public String getName() {
        return "Foo Service";
    }
}
