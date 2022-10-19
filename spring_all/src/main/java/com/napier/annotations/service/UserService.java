package com.napier.annotations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napier.annotations.dao.UserDao;

//obj will created by ioc for UserService class
@Service
public class UserService {
	
	//here we are using another class i.e., UserDao class, by DI using Autowired annotation
	@Autowired
	private UserDao ud;
	UserService()
	{
		System.out.println("UserService constructor...");
	}

	public void saveUser()
	{
		ud.save();
	}
}
