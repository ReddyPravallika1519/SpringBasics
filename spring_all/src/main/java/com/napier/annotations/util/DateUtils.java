package com.napier.annotations.util;

import org.springframework.stereotype.Component;

//obj will created by ioc for DateUtils class
@Component
public class DateUtils {
	
	DateUtils()
	{
		System.out.println("Date utils constructor......");
	}
	
	

}
