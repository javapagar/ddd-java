package es.javapagar.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"es.javapagar.apps"})
public class Initializer {

	public static void main(String[] args) {
		SpringApplication.run(Initializer.class, args);
	}

}
