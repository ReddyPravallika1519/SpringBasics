package com.springlearn.diwithoutspring;

public interface IpaymentInterface {
	
	void payAmount(int amt);

}

class Credit implements IpaymentInterface
{
	Credit()
	{
		System.out.println("Credit card constructor......");
	}
	public void payAmount(int amt)
	{
		System.out.println("credit card bill payment is "+amt);
	}
}

class Debit implements IpaymentInterface
{
	Debit()
	{
		System.out.println("Debit card constructor......");
	}
	public void payAmount(int amt)
	{
		System.out.println("debit card bill payment is "+amt);
	}
}