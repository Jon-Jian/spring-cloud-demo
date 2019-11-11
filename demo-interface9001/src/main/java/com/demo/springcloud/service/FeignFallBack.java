package com.demo.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author JianXiaoBing
 * @date 2019/11/7 21:22
 */
@Component
public class FeignFallBack implements FallbackFactory<ApiService> {
    @Override
    public ApiService create(Throwable throwable) {
        return new ApiService() {
            @Override
            public String test() {
                return "Consumer客户端提供的降级信息,此刻服务Provider已经关闭。。。";
            }
        };
    }
}
