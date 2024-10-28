package com.myproj.springbootfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.myproj.springbootfirst.model.Alien;
import com.myproj.springbootfirst.model.Laptop;
import com.myproj.springbootfirst.service.LaptopService;

@SpringBootApplication// no need of xml based config or java/annotation based config
public class SpringbootfirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootfirstApplication.class, args);
		System.out.println("Hello world");

		//Processor obj = context.getBean(Processor.class);//dependency injection to get processor obj to here in main class and autowiring for laptopclass
	//	obj.process(); 


		// Laptop obj1 = context.getBean(Laptop.class);// Dependency injection for laptop class example
		// obj1.compile();

		// Alien obj = context.getBean(Alien.class);
		// System.out.println(obj.getAge());
		// obj.code();

		Laptop lap = context.getBean(Laptop.class);
		LaptopService service = context.getBean(LaptopService.class);
		service.addLaptop(lap);

	}

}
