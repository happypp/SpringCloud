package com.springboot.service.impl;

import com.springboot.service.ConsumerService;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements ConsumerService {
    @Override
    public String helloSpringCloud(String name) {
        return "sorry "+name;
    }
}
