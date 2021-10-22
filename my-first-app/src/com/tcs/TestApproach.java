package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApproach {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
		CustomerService service=(CustomerService)context.getBean("service");
		service.testDependencies();
		((ClassPathXmlApplicationContext)context).close();
	}
}
