package com.quantumcloud.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableEurekaClient
@EnableConfigServer
public class EurekaclientApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaclientApplication.class, args);
	}

}
