package com.example.demo.beanorder;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(2)
public class Lion implements Animal, Ordered {

    @Override
    public String getName() {
        return "Lion";
    }

    public Lion() {
        System.out.println("Lion bean created");
    }

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}
    
}
