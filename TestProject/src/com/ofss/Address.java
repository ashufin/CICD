package com.ofss;

public class Address {
	
	int flastNo;
	String streetName;
	String city;
	long pinCode;
	/**
	 * Adding comment
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int flastNo, String streetName, String city, long pinCode) {
		super();
		this.flastNo = flastNo;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String msg=this.city+""+this.city+this.flastNo;
		System.out.println(msg);
		return msg;
	}
}
