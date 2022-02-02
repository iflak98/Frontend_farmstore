package com.cg.farmstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "FarmStore API", version = "1.0", description = "An online store to facilitate the farmers and suppliers to sell and buy the freshly grown items directly."))
public class FarmStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmStoreApplication.class, args);
	}

}
