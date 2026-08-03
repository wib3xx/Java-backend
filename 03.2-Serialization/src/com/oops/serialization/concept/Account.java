package com.oops.serialization.concept;

import java.io.Serializable;

public class Account implements Serializable{

	
	private static final long serialVersionUID = 1L;  
	private transient int balance;          //transient --> skips the serialization
	private String name;
	private String password;
	private String location;
	//private String address;
	public Account(int balance, String name, String password, String location) {
		super();
		this.balance = balance;
		this.name = name;
		this.password = password;
		this.location = location;
	}
	public int getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getLocation() {
		return location;
	}
}
