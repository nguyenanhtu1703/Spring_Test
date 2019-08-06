package com.nguyenanhtu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Configuration.xml");
		
		Customer tmp1 = (Customer)appContext.getBean("proBean");
		System.out.println(tmp1.getName());
		
		Customer tmp2 = (Customer)appContext.getBean("proBean2");
		System.out.println(tmp2.getName());
		
		
		
		
	}
}
