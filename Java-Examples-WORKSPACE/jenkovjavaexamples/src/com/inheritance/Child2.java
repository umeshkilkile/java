package com.inheritance;

public class Child2 extends Parent2 {
	public int childPublicNum1 = 2;
	private int childPrivateNum2 = 2;
	protected int childProtectedNum3 = 2;
	int childDefaultNum4 = 2;

	public int getChildPublicNum1() {
		return childPublicNum1;
	}

	public void setChildPublicNum1(int parentPublicNum1) {
		childPublicNum1 = parentPublicNum1;
	}

	public int getChildPrivateNum2() {
		return childPrivateNum2;
	}

	public void setChildPrivateNum2(int parentPrivateNum2) {
		childPrivateNum2 = parentPrivateNum2;
	}

	public int getChildProtectedNum3() {
		return childProtectedNum3;
	}

	public void setChildProtectedNum3(int parentProtectedNum3) {
		childProtectedNum3 = parentProtectedNum3;
	}

	public int getChildDefaultNum4() {
		return childDefaultNum4;
	}

	public void setChildDefaultNum4(int parentDefaultNum4) {
		childDefaultNum4 = parentDefaultNum4;
	}

	public void add() {
		System.out.println("From Child2");
		System.out.println(childPublicNum1 + childPrivateNum2 + childProtectedNum3 + childDefaultNum4);
	}
}
