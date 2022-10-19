//Dependency injection without spring framework (IOC container)
package com.springlearn.diwithspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {

	public static void main(String[] args) {
	
		ApplicationContext con = new ClassPathXmlApplicationContext("di_spring.xml");
		Payment obj = (Payment) con.getBean("target_class");
		obj.callAmount(90000);
	
	

	}

}
