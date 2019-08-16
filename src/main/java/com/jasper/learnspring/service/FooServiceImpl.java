package com.jasper.learnspring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService {

    private final String name = "Foo Service";

    public String getName() {
        return name;
    }
}
