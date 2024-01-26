package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringLifecycleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringLifecycleApplication.class, args);
        University univ = context.getBean(University.class);

        System.out.println(univ.getDirectorName());
        System.out.println(univ.getName());
        System.out.println(univ);
        
        
        University univ1 = context.getBean(University.class);

        System.out.println(univ1.getDirectorName());
        System.out.println(univ1.getName());
        System.out.println(univ1);
        
        
        Employee emp = context.getBean(Employee.class);
        System.out.println(emp.name);
        System.out.println(emp.id);
        
       context.close();
    }
}
