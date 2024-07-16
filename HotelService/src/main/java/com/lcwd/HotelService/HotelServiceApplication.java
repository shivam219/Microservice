package com.lcwd.HotelService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@EnableWebMvc
@OpenAPIDefinition
@EnableEurekaClient
@SpringBootApplication
public class HotelServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}
}
