package com.springcloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloSpringCloudController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/helloSpringCloud")
    public String helloSpringCloud(){
        ServiceInstance instance = client.getLocalServiceInstance();
        return "From Service-A, Result say : helloSpringCloud , Port:" + instance.getPort();
    }

}
