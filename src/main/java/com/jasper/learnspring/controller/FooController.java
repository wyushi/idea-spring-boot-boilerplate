package com.jasper.learnspring.controller;

import com.jasper.learnspring.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private FooService fooService;

    @RequestMapping("/foo")
    public String get() {
        return fooService.getName();
    }

    @Autowired
    public void setFooService(FooService fooService) {
        this.fooService = fooService;
    }
}
