package com.springlearn.diwithspring;

public interface IpaymentInterface {
	
	void payAmount(int amt);

}

class Credit implements IpaymentInterface
{
	private String cname;
	
	public Credit(String cname) {
		this.cname = cname;
		System.out.println("Credit card constructor......");
	}
	
	public void payAmount(int amt)
	{
		System.out.println("credit card bill payment is "+amt);
		System.out.println("user is "+cname);
	}

	
}

class Debit implements IpaymentInterface
{
	private String dname;
	Debit()
	{
		System.out.println("Debit card constructor......");
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void payAmount(int amt)
	{
		System.out.println("debit card bill payment is "+amt);
		System.out.println("user is "+dname);
	}
}