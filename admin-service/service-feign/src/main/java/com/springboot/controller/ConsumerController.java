package com.springboot.controller;

import com.springboot.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("helloSpringCloud")
    public String helloSpringCloud(@RequestParam(value = "name") String name){
        return consumerService.helloSpringCloud(name);
    }
}
