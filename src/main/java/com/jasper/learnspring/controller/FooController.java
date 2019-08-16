package com.jasper.learnspring.controller;

import com.jasper.learnspring.service.FooService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private final ObjectProvider<FooService> fooServiceProvider;

    public FooController(ObjectProvider<FooService> fooServiceProvider) {
        this.fooServiceProvider = fooServiceProvider;
    }

    @RequestMapping("/foo")
    public String get() {
        return fooServiceProvider.getObject().getName();
    }
}
