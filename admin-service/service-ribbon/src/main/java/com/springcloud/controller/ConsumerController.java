package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/helloSpringCloud")
    public String helloSpringCloud() {
//        this.loadBalancerClient.choose("service-A");//随机访问策略
        return restTemplate.getForEntity("http://service-A/helloSpringCloud", String.class).getBody();

    }
}
