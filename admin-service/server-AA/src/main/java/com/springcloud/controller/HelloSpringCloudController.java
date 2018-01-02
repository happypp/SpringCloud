package com.springcloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloSpringCloudController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @Value("${url}")
    private String url;

    @GetMapping("/helloSpringCloud")
    public String helloSpringCloud(@RequestParam(value = "name") String name){
        ServiceInstance instance = client.getLocalServiceInstance();
        return "From Service-A, Result "+ name +" say : helloSpringCloud , Port:" + instance.getPort() + " " + url;
    }

}
