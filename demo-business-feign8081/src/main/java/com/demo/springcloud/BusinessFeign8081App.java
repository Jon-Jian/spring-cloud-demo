package com.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author JianXiaoBing
 * @date 2019/11/3 16:45
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.demo.springcloud")
public class BusinessFeign8081App {

    public static void main(String[] args) {
        SpringApplication.run(BusinessFeign8081App.class, args);
    }

}
