package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public DemoApplication() throws Exception {
		Thread.sleep(10000);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
	}

}
