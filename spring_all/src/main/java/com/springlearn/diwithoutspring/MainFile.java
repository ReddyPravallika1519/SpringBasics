//Dependency injection without spring framework (IOC container)
package com.springlearn.diwithoutspring;

public class MainFile {

	public static void main(String[] args) {
		/*
		//construction injection
		Payment obj = new Payment(new Credit());
		obj.callAmount(5000);
		*/
		
		//setter injection
		Payment obj = new Payment();
		obj.setCardType(new Credit());
		obj.callAmount(9999);
		
	

	}

}
