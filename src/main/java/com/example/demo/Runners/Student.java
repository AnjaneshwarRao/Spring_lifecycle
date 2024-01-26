package com.example.demo.Runners;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(3)
@Component
public class Student {
public Student() {
	System.out.println("Student is created");
}
}
