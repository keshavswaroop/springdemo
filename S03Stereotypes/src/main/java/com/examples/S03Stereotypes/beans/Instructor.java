package com.examples.S03Stereotypes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
	
	@Value("12")
	private int id;
	
	@Value("Max")
	private String name;
	
	@Autowired
	private Address homeAddress;
	
	
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", homeAddress=" + homeAddress + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
