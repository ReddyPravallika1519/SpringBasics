package com.napier.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.napier.annotations.util.PswdUtils;

//obj will created by ioc for  AppConfig class
@Configuration
public class AppConfig {
	
	AppConfig()
	{
		System.out.println("App Config constructor....");
	}
	
	//We are customizing PswdUtils class, so we used @Bean here
	@Bean
	public PswdUtils getInstance()
	{
		PswdUtils pu = new PswdUtils("SHA1");
		return pu;
		
	}

}
