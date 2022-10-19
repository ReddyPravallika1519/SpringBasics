package com.springlearn.diwithspring;

public class Payment {

	private IpaymentInterface cardType;

	//setter injection
	public void setCardType(IpaymentInterface cardObj) {
		this.cardType = cardObj;
	}

	
	//constructor injection
	Payment(IpaymentInterface cardObj)
	{
		this.cardType = cardObj;
	}
	
	
	
	
	
	void callAmount(int amt)
	{
		cardType.payAmount(amt);
		
	}
	

}
