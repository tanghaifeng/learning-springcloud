package com.tangcloud.serviceeureka3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceEureka3Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEureka3Application.class, args);
    }

}
