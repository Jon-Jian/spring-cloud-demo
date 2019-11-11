package com.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author JianXiaoBing
 * @date 2019/11/3 20:14
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Api8001App {

    public static void main(String[] args) {

        SpringApplication.run(Api8001App.class, args);

    }

}
