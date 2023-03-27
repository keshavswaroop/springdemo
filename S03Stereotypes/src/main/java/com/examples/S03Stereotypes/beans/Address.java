package com.examples.S03Stereotypes.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Chennai")
	String city;
	
	@Value("570011")
	int pincode;
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	
}
