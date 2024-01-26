package com.example.demo.Runners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRunnersApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("In main : method :" + args[0] + ":"+ args[1]);
System.out.println("*****");
System.out.println("Before application.run method");
SpringApplication.run(SpringbootRunnersApplication.class, args);
	}

}
