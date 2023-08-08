package com.example.speakingclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//@EnableOpenApi
public class SpeakingClock1Application  {

	public static void main(String[] args) {
		SpringApplication.run(SpeakingClock1Application.class, args);
	}

}
