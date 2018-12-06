package com.designpatterns.behavioral.interpreter_17;

public class NumberExpression_2 implements IExpression_1 {

	int number;

	public NumberExpression_2(int i) {
		number = i;
	}

	public NumberExpression_2(String s) {
		number = Integer.parseInt(s);
	}

	@Override
	public int interpret() {
		return number;
	}

}
