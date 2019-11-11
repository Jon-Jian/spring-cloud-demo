package com.demo.springcloud.controller;

import com.demo.springcloud.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author JianXiaoBing
 * @date 2019/11/3 16:39
 */
@RestController
public class TestController {

    @Autowired
    private ApiService apiService;


    @GetMapping("/")
    public String test() {
        System.out.println("run in 8081 . ");
        return apiService.test();
    }

}
