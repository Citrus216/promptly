package com.promptly.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BackendApplication.class, args);
	}

}
