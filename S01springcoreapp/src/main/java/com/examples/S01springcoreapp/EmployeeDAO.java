package com.examples.S01springcoreapp;

public class EmployeeDAO {
	private String dbServer;
	private String dbport;
	private String dbuser;
	private String dbpassword;
	
	@Override
	public String toString() {
		return "EmployeeDAO [dbServer=" + dbServer + ", dbport=" + dbport + ", dbuser=" + dbuser + ", dbpassword="
				+ dbpassword + "]";
	}

	public EmployeeDAO(String dbServer, String dbport, String dbuser, String dbpassword) {
		super();
		this.dbServer = dbServer;
		this.dbport = dbport;
		this.dbuser = dbuser;
		this.dbpassword = dbpassword;
	}

}
