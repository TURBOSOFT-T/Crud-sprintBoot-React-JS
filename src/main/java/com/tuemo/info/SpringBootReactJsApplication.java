package com.tuemo.info;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tuemo.info.entiyties.Employee;
import com.tuemo.info.repository.EmployeeRepository;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootReactJsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactJsApplication.class, args);

	}

	/*
	 * @Bean CommandLineRunner start(EmployeeRepository employeeRepository) { return
	 * args -> {
	 * 
	 * employeeRepository.save(new Employee(11, "Eric", "Abidal", "Ad@yahoo.fr"));
	 * employeeRepository.save(new Employee(22, "Fatma", "Fatma", "Abid@yahoo.fr"));
	 * employeeRepository.save(new Employee(33, "Tuemo", "Thomas", "Ad@yahoo.fr"));
	 * employeeRepository.save(new Employee(44, "Zidane", "ZZZ", "Ad@yahoo.fr")); };
	 * }
	 */
}
