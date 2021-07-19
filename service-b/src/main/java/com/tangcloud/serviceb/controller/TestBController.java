package com.tangcloud.serviceb.controller;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableFeignClients
public class TestBController {

    @Resource
    private ServiceAFeignClient serviceAFeignClient;

    @GetMapping("call")
    public String call() {
        String s = serviceAFeignClient.hello();
        return "B to A :"+s;
    }

    @GetMapping("callHi")
    public String callHi() {
        String s = serviceAFeignClient.hi();
        return "B to A :"+s;
    }

}
