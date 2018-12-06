package com_14.interfaces;

public class Evolving_Interface_DEMO_6 implements DoItPlus {

	@Override
	public int doSomething(int i, int x) {
		return i + x;
	}

	@Override
	public String doSomethingElse(String s) {
		return s;
	}

	@Override
	public boolean didItWork(int i, int x, String s) {
		return  (i + x) > 100 && s.equalsIgnoreCase("Yes");
	}

	public static void main(String[] args) {
		Evolving_Interface_DEMO_6 evolving_Interface_6 = new Evolving_Interface_DEMO_6();
		int sum = evolving_Interface_6.doSomething(10, 20);
		System.out.println(sum);
		System.out.println(evolving_Interface_6.doSomethingElse("Yes yes"));
		System.out.println(evolving_Interface_6.didItWork(20, 300, "Yes"));
		System.out.println(evolving_Interface_6.didItWorkedDefault(10, 200, "Yes"));
	}
}
