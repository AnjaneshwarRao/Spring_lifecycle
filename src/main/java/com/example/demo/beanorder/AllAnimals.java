package com.example.demo.beanorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class AllAnimals {
	
	@Autowired
	List<Animal> animals;

}
