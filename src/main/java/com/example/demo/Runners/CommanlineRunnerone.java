package com.example.demo.Runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(2)
public class CommanlineRunnerone implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Command line Args of"  + args[1]  + " :"  + args[2]);
		System.out.println("I am in command line Runnerone method");
	}

}
