package com.napier.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.napier.annotations.service.UserService;


@ComponentScan(basePackages="com.napier.annotations")
public class MainFile {

	public static void main(String[] args) {
		System.out.println("Main class");
		ApplicationContext con = new AnnotationConfigApplicationContext(MainFile.class);
		UserService us = con.getBean(UserService.class);
		us.saveUser();

	}

}
