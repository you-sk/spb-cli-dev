package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.TestService;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(Demo1Application.class, args);
		TestService service = ctx.getBean(TestService.class);
		System.out.println(service.execute());
		
//		SpringApplication.run(Demo1Application.class, args);
	}

}
