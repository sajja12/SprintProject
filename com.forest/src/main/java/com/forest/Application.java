package com.forest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.forest.repository.ProductRepository;

@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
	@Autowired    //autowire the Application class 
	ProductRepository Productrepo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	

}
