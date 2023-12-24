package com.api.burger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan("com.api.burger.util")
public class BurgerStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BurgerStoreApplication.class, args);
	}

}
