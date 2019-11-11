package com.demo.springcloud;

import com.demo.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author JianXiaoBing
 * @date 2019/11/3 16:45
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient  //  服务发现
@RibbonClient(name = "DEMO-API", configuration = MySelfRule.class)    //  配置自定义规则ribbon 负载均衡 使用config 则不需要
public class BusinessApp {

    public static void main(String[] args) {
        SpringApplication.run(BusinessApp.class, args);
    }

}
