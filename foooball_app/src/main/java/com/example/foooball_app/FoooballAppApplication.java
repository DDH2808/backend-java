package com.example.foooball_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.example.foooball_app.entity"})
public class FoooballAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoooballAppApplication.class, args);
	}

}
