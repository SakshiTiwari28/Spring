package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}

}
