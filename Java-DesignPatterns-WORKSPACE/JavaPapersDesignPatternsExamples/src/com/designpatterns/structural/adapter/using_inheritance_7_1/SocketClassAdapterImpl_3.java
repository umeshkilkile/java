package com.designpatterns.structural.adapter.using_inheritance_7_1;

/*
 * Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. 
 * The object that joins these unrelated interface is called an Adapter. As a real life example, we can think of a mobile charger 
 * as an adapter because mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India). 
 * So the mobile charger works as an adapter between mobile charging socket and the wall socket.
 */
//http://www.journaldev.com/1487/adapter-design-pattern-in-java-example-tutorial

//Using inheritance for adapter pattern
public class SocketClassAdapterImpl_3 extends Socket_2 implements	SocketAdapter {

	@Override
	public Volt_1 get120Volt() {
		return getVolt();
	}

	@Override
	public Volt_1 get12Volt() {
		Volt_1 v = getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt_1 get3Volt() {
		Volt_1 v = getVolt();
		return convertVolt(v, 40);
	}

	private Volt_1 convertVolt(Volt_1 v, int i) {
		return new Volt_1(v.getVolts() / i);
	}

}