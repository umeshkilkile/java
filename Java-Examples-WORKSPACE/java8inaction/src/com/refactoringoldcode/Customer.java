package com.refactoringoldcode;

import java.math.BigDecimal;

public class Customer {
	private String name;
	private int acnumber;
	private long balance;

	Customer() {

	}

	Customer(String name, int acnumber, long balance) {
		this.name = name;
		this.acnumber = acnumber;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcnumber() {
		return acnumber;
	}

	public void setAcnumber(int acnumber) {
		this.acnumber = acnumber;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", acnumber=" + acnumber + ", balance=" + balance + "]";
	}
}
