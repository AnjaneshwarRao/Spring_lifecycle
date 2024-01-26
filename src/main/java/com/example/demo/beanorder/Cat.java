package com.example.demo.beanorder;

import java.lang.annotation.Annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(-1)
public class Cat implements Animal, Ordered{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "cat";
	}

	
	public Cat() {
		System.out.println("THe cat class is getting loaded");
	}


	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return -1;
	}



}
