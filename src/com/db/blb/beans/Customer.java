package com.db.blb.beans;

import java.util.Map;

public class Customer {
	private double balance;
	private String ownerName;
	private Map<Bond, Integer> portfolio;
	private long customerId;
}
