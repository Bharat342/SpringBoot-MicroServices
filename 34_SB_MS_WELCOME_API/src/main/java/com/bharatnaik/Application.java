package com.bharatnaik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients      // In this application we want to use also FeignClient for Inter Service Communication using (FeignClient).
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
