package com.examples.S01springcoreapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	int id;
	String name;
	private List<String> department;
	private Map<Integer, String> products;
	private Properties countriesLanguages;
	private Address address;
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Properties getCountriesLanguages() {
		return countriesLanguages;
	}
	public void setCountriesLanguages(Properties countriesLanguages) {
		this.countriesLanguages = countriesLanguages;
	}
	public List<String> getDepartment() {
		return department;
	}
	public void setDepartment(List<String> department) {
		this.department = department;
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
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", products=" + products
				+ ", countriesLanguages=" + countriesLanguages + ", address=" + address + "]";
	}
	
	
	
	
	
	

}
