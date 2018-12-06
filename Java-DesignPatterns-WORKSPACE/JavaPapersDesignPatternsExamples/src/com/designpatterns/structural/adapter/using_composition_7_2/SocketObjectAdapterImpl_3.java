package com.designpatterns.structural.adapter.using_composition_7_2;

public class SocketObjectAdapterImpl_3 implements SocketAdapter {

	// Using Composition for adapter pattern
	private Socket_2 sock = new Socket_2();

	@Override
	public Volt_1 get120Volt() {
		return sock.getVolt();
	}

	@Override
	public Volt_1 get12Volt() {
		Volt_1 v = sock.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt_1 get3Volt() {
		Volt_1 v = sock.getVolt();
		return convertVolt(v, 40);
	}

	private Volt_1 convertVolt(Volt_1 v, int i) {
		return new Volt_1(v.getVolts() / i);
	}
}