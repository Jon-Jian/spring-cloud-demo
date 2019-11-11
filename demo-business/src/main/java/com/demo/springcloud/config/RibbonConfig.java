package com.demo.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *  该类为ribbon的配置类
 * @author JianXiaoBing
 * @date 2019/11/3 20:54
 */
@Configuration
public class RibbonConfig {

    @Bean
    /**
     * Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
     *
     */
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    //@Bean
    /**
     * 定义ribbon负载均衡的规则-可以自定义(但不能被spring boot 扫描到，即默认不能放到与启动类同包及子包下)
     */
    public IRule myRule() {
        //return new RoundRobinRule();
        //return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
        //  RetryRule
        return new RoundRobinRule();
    }

}
