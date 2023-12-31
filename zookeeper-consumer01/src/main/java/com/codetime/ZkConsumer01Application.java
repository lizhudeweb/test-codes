package com.codetime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZkConsumer01Application {
	public static void main(String[] args) {
		SpringApplication.run(ZkConsumer01Application.class, args);
	}
}