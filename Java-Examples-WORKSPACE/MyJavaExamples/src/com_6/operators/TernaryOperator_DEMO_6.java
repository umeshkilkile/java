package com_6.operators;

public class TernaryOperator_DEMO_6 {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		int result;
		boolean someCondition = true;
		result = someCondition ? value1 : value2;

		System.out.println("result : " + result);
		
		int value3 = 3;
		int value4 = 4;
		
		int result5 = true ? (true ? value3 : value4 ) : (true ? value3 : value4);
		System.out.println("result5 : " + result5);
		
		int result6 = false ? (false ? value3 : value4 ) : (false ? value3 : value4);
		System.out.println("result6 : " + result6);
	}
}
