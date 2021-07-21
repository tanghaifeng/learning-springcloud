package com.tangcloud.serviceeureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceEureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEureka2Application.class, args);
    }

}
