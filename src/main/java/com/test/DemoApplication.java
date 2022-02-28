package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);
		/*
		 * Thread t1 = new Thread(()->{ System.out.println("welcome1"); }); t1.start();
		 * t1.join(); System.out.println("Welcome");
		 */
	}

}
