package com.napier.annotations.util;

import org.springframework.stereotype.Component;
//if i use @component , ioc will create obj.but here I need customize obj
//@Component

//obj won't created by ioc for  PswdUtils class
public class PswdUtils {
	
	public PswdUtils(String algo)
	{
		System.out.println("PswdUtils constructor...."+algo);
	}
	
	
}
