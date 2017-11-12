package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerAaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerAaApplication.class, args);
	}
}
