package com.jasper.learnspring.controller;

import com.jasper.learnspring.service.BarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class FooController {

    private Optional<BarService> barService;

    @Autowired
    public FooController(Optional<BarService> barService) {
        this.barService = barService;
    }

    @RequestMapping("/foo-bar")
    public String get() {
        String name = "Foo Service";
        String version = barService.isPresent() ? barService.get().getVersion() : "0.0.1";
        return String.format("%s [%s]", name, version);
    }
}
