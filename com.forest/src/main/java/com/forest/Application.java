package com.forest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.forest.repository.ProductRepository;

@SpringBootApplication
public class Application {
	@Autowired
	ProductRepository Productrepo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	

}

