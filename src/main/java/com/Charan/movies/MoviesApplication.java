package com.Charan.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication

public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}



//spring.data.mongodb.database=${env.MONGO_DATABASE}
//		spring.data.mongodb.uri=mongodb+srv://${env.MONGO_USER}:<${env.MONGO_PASSWORD}>@${env.MONGO_CLUSTER}
