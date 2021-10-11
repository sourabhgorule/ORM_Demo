package com.ormDemo.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	
	private String city,pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}
