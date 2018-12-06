package com.designpatterns.structural.adapter.using_composition_7_2;

public class AdapterPattern_Using_Object_Demo_5 {
	public static void main(String[] args) {

		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl_3();
		Volt_1 v3 = getVolt(sockAdapter, 3);
		Volt_1 v12 = getVolt(sockAdapter, 12);
		Volt_1 v120 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
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
