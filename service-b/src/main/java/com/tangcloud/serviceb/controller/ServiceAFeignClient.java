package com.tangcloud.serviceb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SERVICE-OBJCAT-A")
public interface ServiceAFeignClient {
    @GetMapping("helloA")
    String hello();

    @GetMapping("hi")
    String hi();
}
