package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
String name;
int id;

public Employee() {
	System.out.println("constructor injection is called");
}
}
