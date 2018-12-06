package com.comp;

public class Invoice {
	Double amount;
	String title;
	int id;
	String customer;

	public Invoice() {
	}

	public Invoice(Double amount, String title, int id, String customer) {
		this.amount = amount;
		this.title = title;
		this.id = id;
		this.customer = customer;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Title: " + title + ",");
		sb.append("Amount: " + amount + ",");
		sb.append("Id: " + id + ",");
		sb.append("Customer: " + customer);
		return sb.toString();
	}
}
