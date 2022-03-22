package com.example.projeto_final_sq58;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.example.projeto_final_sq58.model")
@SpringBootApplication
public class ProjetoFinalSq58Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoFinalSq58Application.class, args);
	}

}
