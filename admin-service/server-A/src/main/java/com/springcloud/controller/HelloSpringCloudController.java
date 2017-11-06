package com.springcloud.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloSpringCloudController {

    private final Logger logger = Logger.getLogger(getClass());


    @GetMapping("/helloSpringCloud")
    public String helloSpringCloud(){
        return "HelloSpringCloudController";
    }

}
