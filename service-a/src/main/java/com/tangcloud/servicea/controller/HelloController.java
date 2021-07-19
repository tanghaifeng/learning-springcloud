package com.tangcloud.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("helloA")
    public String hello() {

        return "service-a helloA";
    }

    @GetMapping("hi")
    public String hi() {
        return "service-a Hi";
    }
}
