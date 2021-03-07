package com.pokedex.status;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatusApplication.class, args);
		
		if(System.currentTimeMillis() == 1l) {
			System.out.println("teste errado");
		}else {
			System.out.println("teste correto");
		}
	}

}
