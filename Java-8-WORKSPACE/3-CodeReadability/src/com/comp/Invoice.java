package com.comp;

public class Invoice {
	Double amount;
	String itemName;

	public Invoice() {
	}
	
	public Invoice(Double amount, String itemName){
		this.amount = amount;
		this.itemName = itemName;
	}
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ItemName: " + itemName + ",");
		sb.append("Amount: " + amount);
		return sb.toString();
	}
}
