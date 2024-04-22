package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaFastpassConsoleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFastpassConsoleDemoApplication.class, args);
	}

}
