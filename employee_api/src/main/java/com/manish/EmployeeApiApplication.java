package com.manish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = {"com.manish.comtroller"})
@SpringBootApplication
@ComponentScan(basePackages = {"com.*"})
public class EmployeeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiApplication.class, args);
	}

}
