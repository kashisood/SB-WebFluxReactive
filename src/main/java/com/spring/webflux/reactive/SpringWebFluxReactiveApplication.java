package com.spring.webflux.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//we have given nothing special to tell that this is a webflux application
//we have included spring web flux starter maven dependency, 
//so spring itself understands that this is a reactive application

@SpringBootApplication
public class SpringWebFluxReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebFluxReactiveApplication.class, args);
	}

}
