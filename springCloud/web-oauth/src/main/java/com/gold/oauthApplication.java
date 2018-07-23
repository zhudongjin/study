package com.gold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import java.util.Collections;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class oauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(oauthApplication.class, args);
	}

}
