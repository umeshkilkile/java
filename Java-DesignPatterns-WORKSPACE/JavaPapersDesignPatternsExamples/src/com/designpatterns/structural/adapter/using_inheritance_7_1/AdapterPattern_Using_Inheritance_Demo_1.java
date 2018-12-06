package com.designpatterns.structural.adapter.using_inheritance_7_1;

public class AdapterPattern_Using_Inheritance_Demo_1 {
	public static void main(String[] args) {
		testClassAdapter();
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl_3();
		Volt_1 v3 = getVolt(sockAdapter, 3);
		Volt_1 v12 = getVolt(sockAdapter, 12);
		Volt_1 v120 = getVolt(sockAdapter, 120);
		Volt_1 vDefault = getVolt(sockAdapter, 0);
		System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
		System.out.println("Default volts using Class Adapter=" + vDefault.getVolts());
	}

	private static Volt_1 getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
		case 3:
			return sockAdapter.get3Volt();
		case 12:
			return sockAdapter.get12Volt();
		case 120:
			return sockAdapter.get120Volt();
		default:
			return sockAdapter.get120Volt();
		}
	}
}
