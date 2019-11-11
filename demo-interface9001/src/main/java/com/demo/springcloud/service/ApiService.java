package com.demo.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JianXiaoBing
 * @date 2019/11/7 21:18
 */
@FeignClient(value = "demo-api", fallback = FeignFallBack.class)
public interface ApiService {

    @RequestMapping("/test")
    String test();
}
