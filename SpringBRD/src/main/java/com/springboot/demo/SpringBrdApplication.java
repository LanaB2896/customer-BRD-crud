package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component("com.springboot.demo")
public class SpringBrdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBrdApplication.class, args);
	}

}

