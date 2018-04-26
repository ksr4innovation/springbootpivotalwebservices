package com.snkit.pivotalcustservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PivotalcustserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PivotalcustserviceApplication.class, args);
	}
}
