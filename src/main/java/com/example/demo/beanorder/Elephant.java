package com.example.demo.beanorder;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(1)
public class Elephant implements Animal,Ordered {


	
	public Elephant() {
		System.out.println("Elephant loading created");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Elephant";
	}
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return -2;
	}
	
}
