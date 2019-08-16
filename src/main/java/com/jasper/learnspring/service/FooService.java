package com.jasper.learnspring.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service @Lazy
public class FooService {

    public FooService() {
        System.out.println("FooService constructed!");
    }

    public String getName() {
        return "Foo Service";
    }
}
