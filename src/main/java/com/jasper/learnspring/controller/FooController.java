package com.jasper.learnspring.controller;

import com.jasper.learnspring.service.BarService;
import com.jasper.learnspring.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private FooService fooService;
    private BarService barService;

    @Autowired
    public FooController(FooService fooService) {
        this.fooService = fooService;
    }

    @RequestMapping("/foo-bar")
    public String get() {
        String name = fooService.getName();
        String version = barService != null ? barService.getVersion() : "0.0.1";
        return String.format("%s [%s]", name, version);
    }

    @Autowired(required = false)
    public void setBarService(BarService barService) {
        this.barService = barService;
    }
}
