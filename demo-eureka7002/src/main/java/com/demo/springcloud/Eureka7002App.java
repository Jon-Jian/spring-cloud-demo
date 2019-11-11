package com.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author JianXiaoBing
 * @date 2019/11/3 21:33
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka7002App {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7002App.class, args);
    }

}
