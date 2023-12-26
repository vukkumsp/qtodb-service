package com.blogoid.qtodbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QtodbServiceApplication {

	public static void main(String[] args) {
		System.out.println("Started QtodbServiceApplication");
		SpringApplication.run(QtodbServiceApplication.class, args);
	}

}
