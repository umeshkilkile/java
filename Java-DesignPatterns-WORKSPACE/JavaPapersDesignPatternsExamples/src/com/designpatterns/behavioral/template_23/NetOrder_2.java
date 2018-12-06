package com.designpatterns.behavioral.template_23;

public class NetOrder_2 extends OrderProcessTemplate_1 {
	@Override
	public void doSelect() {
		System.out.println("Item added to online shopping cart,");
		System.out.println("Get gift wrap preference,");
		System.out.println("Get delivery address.");
	}

	@Override
	public void doPayment() {
		System.out.println("Online Payment through Netbanking/Cards.");
	}

	@Override
	public void doDelivery() {
		System.out.println("Ship the item through post to delivery address");
	}

}
