package com.tts.springbootW13D4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EnableJpaRepositories("com.tts.springbootW13D4.repository")
//@EntityScan("com.tts.springbootW13D4.model")
@SpringBootApplication
public class SpringbootW13D4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootW13D4Application.class, args);
	}

}
