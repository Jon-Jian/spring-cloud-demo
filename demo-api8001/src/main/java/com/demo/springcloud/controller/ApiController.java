package com.demo.springcloud.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JianXiaoBing
 * @date 2019/11/3 20:13
 */
@RestController
public class ApiController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("run in api8001 . ");
        return "run in api8001 . ";
    }

}
