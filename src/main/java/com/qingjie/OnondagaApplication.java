package com.qingjie;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class OnondagaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnondagaApplication.class, args);

	}
}
