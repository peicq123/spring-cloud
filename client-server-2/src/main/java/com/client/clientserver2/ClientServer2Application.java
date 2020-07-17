package com.client.clientserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(ClientServer2Application.class, args);
    }

}
