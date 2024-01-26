package com.example.demo.Runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
@Component
public class Application_Runners implements ApplicationRunner, Ordered{

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stu
		System.out.println("*******");
		System.out.println("I am in application runner method");
		System.out.println( "the method application runner" + args.getNonOptionArgs());
	}

}
