package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Data
@Setter
@Getter
@Scope("singleton")
@AllArgsConstructor
public class University implements  DisposableBean,InitializingBean {

    public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	String name = "anju";
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String directorName; // Corrected the variable name

    public University() {
        System.out.print("University is created");
    }

    //@PostConstruct
    public void afterPropertiesSet() throws Exception { // Corrected the method name
        System.out.println("Initializing the data of the university");
        System.out.println("Logic is executed at the time of bean configuration");
        if (name.equalsIgnoreCase("anju")) {
            directorName = "abhi";
        }
    }

  //  @PreDestroy
    public void destroy() throws Exception {
        System.err.println("****Destroying******");
    }
}
     