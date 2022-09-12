package br.edu.infnet.elberthapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ElberthAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElberthAppApplication.class, args);
	}

}
