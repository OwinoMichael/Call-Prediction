package com.callsprediction.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class CallPredictionBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallPredictionBackendApplication.class, args);
	}

}
