package com.ofss;

public class Customer {

	int flatNo;
	String customerName;
	String address;
	public Customer(int flatNo, String customerName, String string) {
		super();
		this.flatNo = flatNo;
		this.customerName = customerName;
		this.address = string;//DI
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String msg=this.address+""+this.customerName;
		return msg;
	}
	
}
