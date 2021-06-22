package com.tangcloud.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
public class TestBController {

    @Autowired
    private ServiceAFeignClient serviceAFeignClient;


    @GetMapping("call")
    public String call() {
        String s = serviceAFeignClient.hello();
        return "B to A :"+s;
    }

}
