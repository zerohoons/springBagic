package com.ict.ex07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextMain {
	public static void main(String[] args) {
		ApplicationContext context 
				= new ClassPathXmlApplicationContext("com/ict/ex07/config.xml");
		
		 Service service = (Service)context.getBean("service");
		 service.biz();
	}
}












