package com.cg.emtoolapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmtoolapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmtoolapiApplication.class, args);
	}

}
