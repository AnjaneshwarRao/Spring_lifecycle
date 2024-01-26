package com.example.demo.beanorder;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(3)
public class Tiger  implements Animal, Ordered{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Tiger";
	}

	public Tiger() {
		System.out.println("the Tiger class is loading");
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 3;
	}
}
