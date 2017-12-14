package com.springboot.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-A")
public interface ConsumerService {

    @RequestMapping(value = "helloSpringCloud",method = RequestMethod.GET)
    public String helloSpringCloud(@RequestParam(value = "name") String name);

}
