package com.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
    @HystrixCommand(fallbackMethod = "hiError")
    public String helloSpringCloud(@RequestParam(value = "name") String name) {
//        this.loadBalancerClient.choose("service-A");//随机访问策略
        return restTemplate.getForEntity("http://service-A/helloSpringCloud?name=" + name, String.class).getBody();

    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
