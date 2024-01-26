package com.example.demo.Runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Component
public class CommandlineRunnerTwo implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Command line args of" + args[0] + args[1]);
		System.out.println("I am in command line Runnermethodtwo method");
	}

}
