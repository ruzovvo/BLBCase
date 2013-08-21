package com.db.blb.beans;

import java.util.List;

public class Trader {
	private List<Customer> customers;
	private Customer currCustomer;
	private long traderId;
	private String username;
	private boolean valid = false;
	
	public Trader(String name)
	{
		this.username = name;
	}
	
	public boolean isValid()
	{
		return valid;
	}
	
	public String getUsername()
	{
		return username;
	}
}
