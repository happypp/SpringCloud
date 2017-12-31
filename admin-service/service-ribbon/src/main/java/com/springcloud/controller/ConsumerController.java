package com.springcloud.controller;

import com.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @GetMapping("helloSpringCloud")
    public String helloSpringCloud(@RequestParam(value = "name") String name) {
        return helloService.helloSpringCloud(name);
    }
}
