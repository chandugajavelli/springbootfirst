package com.myproj.springbootfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootfirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootfirstApplication.class, args);
		System.out.println("Hello world");

		Processor obj = context.getBean(Processor.class);//dependency injection to get processor obj to here in main class and autowiring for laptopclass
		obj.process(); 


		Laptop obj1 = context.getBean(Laptop.class);// Dependency injection for laptop class example
		obj1.compile();

	}

}
