package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther hiber
 * @create 2020/5/13
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced  //该注解赋予RestTemplate负载均衡功能
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
//applicationContext.xml <bean id="" class="">