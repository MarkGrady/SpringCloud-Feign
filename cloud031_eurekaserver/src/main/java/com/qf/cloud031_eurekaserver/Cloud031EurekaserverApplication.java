package com.qf.cloud031_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Cloud031EurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud031EurekaserverApplication.class, args);
    }

}
