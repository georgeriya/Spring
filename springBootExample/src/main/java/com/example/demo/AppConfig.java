package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Employee employeeValue() {
		return new Employee("ABC",101,6000);
	}
}
