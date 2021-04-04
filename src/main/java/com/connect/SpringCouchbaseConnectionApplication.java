package com.connect;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import javax.validation.Validator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class SpringCouchbaseConnectionApplication implements CommandLineRunner {

	@Autowired
	private VehicleRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(SpringCouchbaseConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		this.repo.deleteAll();
		Vehicle v = saveVehicle();
//		repo.save(v);
		System.out.println(this.repo.findById(v.getId()));
	}

	private Vehicle saveVehicle() {
		Vehicle v = new Vehicle("Orange","Lexi");
		v.setId("car76");
		
		return this.repo.save(v);
	}

	
}
