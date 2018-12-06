package com.designpatterns.behavioral.template_23;

public class StoreOrder_3 extends OrderProcessTemplate_1 {
	@Override
	public void doSelect() {
		System.out.println("Customer chooses the item from shelf.");
	}

	@Override
	public void doPayment() {
		System.out.println("Pays at counter through cash/POS");
	}

	@Override
	public void doDelivery() {
		System.out.println("Item deliverd to in delivery counter.");
	}

}
