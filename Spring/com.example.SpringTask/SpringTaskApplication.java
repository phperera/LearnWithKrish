package com.example.SpringTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import services.RentProcessTaskRunner;

import java.beans.JavaBean;

@SpringBootApplication
@EnableTask

public class SpringTaskApplication {
	@Bean
	RentProcessTaskRunner getRentProcessTaskRunner(){
		return new RentProcessTaskRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTaskApplication.class, args);
	}

}
