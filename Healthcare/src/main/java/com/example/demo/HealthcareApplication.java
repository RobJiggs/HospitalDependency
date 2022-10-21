package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.pojo.Ambulance;
import com.example.demo.pojo.Hospital;

@SpringBootApplication
public class HealthcareApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(HealthcareApplication.class, args);
		 
		Hospital hospital =context.getBean(Hospital.class);
		hospital.provideService();
	}
	@Bean
	public Ambulance getAmbulance() {
		
		return new Ambulance();
		
	}

}
