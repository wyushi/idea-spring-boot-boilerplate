package com.jasper.learnspring.controller;

import com.jasper.learnspring.service.FooService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private final FooService fooService;

    public FooController(FooService fooService) {
        this.fooService = fooService;
    }

    @RequestMapping("/foo")
    public String get() {
        return fooService.getName();
    }
}
