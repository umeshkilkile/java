package com.inheritance;

public class Parent2 {
	public int parentPublicNum1 = 1;
	private int parentPrivateNum2 = 1;
	protected int parentProtectedNum3 = 1;
	int parentDefaultNum4 = 1;

	public int getParentPublicNum1() {
		return parentPublicNum1;
	}

	public void setParentPublicNum1(int parentPublicNum1) {
		this.parentPublicNum1 = parentPublicNum1;
	}

	public int getParentPrivateNum2() {
		return parentPrivateNum2;
	}

	public void setParentPrivateNum2(int parentPrivateNum2) {
		this.parentPrivateNum2 = parentPrivateNum2;
	}

	public int getParentProtectedNum3() {
		return parentProtectedNum3;
	}

	public void setParentProtectedNum3(int parentProtectedNum3) {
		this.parentProtectedNum3 = parentProtectedNum3;
	}

	public int getParentDefaultNum4() {
		return parentDefaultNum4;
	}

	public void setParentDefaultNum4(int parentDefaultNum4) {
		this.parentDefaultNum4 = parentDefaultNum4;
	}

	public void add() {
		System.out.println("From Parent2");
		System.out.println(parentPublicNum1 + parentPrivateNum2 + parentProtectedNum3 + parentDefaultNum4);
	}
}
