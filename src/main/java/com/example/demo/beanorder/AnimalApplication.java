package com.example.demo.beanorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnimalApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = SpringApplication.run(AnimalApplication.class );
		AllAnimals animals = context.getBean(AllAnimals.class);
		System.out.println("the animals of the order are" + animals);

	}

}
