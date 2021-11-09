package com.ricardofarias.aula2feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Aula2FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(Aula2FeignApplication.class, args);
	}

}
