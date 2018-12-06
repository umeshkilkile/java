package com.designpatterns.behavioral.template_23;

public class TemplateMethodPatternClient_4 {
	public static void main(String... args) {
		System.out.println("$$$$$$$ NetOrder instance of the Template: $$$$$$$");
		OrderProcessTemplate_1 netOrder = new NetOrder_2();
		netOrder.processOrder();
		System.out.println("$$$$$$$ StoreOrder instance of the Template: $$$$$$$");
		OrderProcessTemplate_1 storeOrder = new StoreOrder_3();
		storeOrder.processOrder();
	}

}
