package com.snkit.pivotalconsumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableZuulProxy
public class PivotalconsumerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PivotalconsumerserviceApplication.class, args);
	}
	
	@LoadBalanced
	@Bean 
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
