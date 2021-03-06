package com_14.interfaces;

public class Evolving_Interface_DEMO_5 implements DoIt {

	@Override
	public int doSomething(int i, int x) {
		return i + x;
	}

	@Override
	public String doSomethingElse(String s) {
		return s;
	}

	public static void main(String[] args) {
		Evolving_Interface_DEMO_5 evolving_Interface_5 = new Evolving_Interface_DEMO_5();
		int sum = evolving_Interface_5.doSomething(10, 20);
		System.out.println(sum);

		System.out.println(evolving_Interface_5.doSomethingElse("Yes yes"));

	}
}
