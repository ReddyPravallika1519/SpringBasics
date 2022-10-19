package com.napier.annotations.dao;

import org.springframework.stereotype.Repository;
//obj will created by ioc forUserDao class
@Repository
public class UserDao {
	
	UserDao()
	{
		System.out.println("User Dao constructor.....");
	}
	
	public void save()
	{
		System.out.println("Save called from userdao class....");
	}
}
