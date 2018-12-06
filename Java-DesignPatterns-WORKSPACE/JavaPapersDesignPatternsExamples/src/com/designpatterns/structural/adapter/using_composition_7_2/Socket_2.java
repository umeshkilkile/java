package com.designpatterns.structural.adapter.using_composition_7_2;

public class Socket_2 {
	public Volt_1 getVolt() {
		return new Volt_1(120);
	}
}
