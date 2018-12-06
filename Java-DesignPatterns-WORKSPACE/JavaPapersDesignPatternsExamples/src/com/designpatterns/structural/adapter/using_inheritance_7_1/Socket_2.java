package com.designpatterns.structural.adapter.using_inheritance_7_1;

public class Socket_2 {
	public Volt_1 getVolt() {
		return new Volt_1(120);
	}
}
