package com.qf.cloud031_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Cloud031ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud031ProviderApplication.class, args);
    }

}
