package com.designpatterns.behavioral.interpreter_17;

import java.util.Stack;

public class InterpreterPattern_6 {
	public static void main(String args[]) {
		String tokenString = "4 3 2 - 1 + *";
		Stack stack = new Stack();
		String[] tokenList = tokenString.split(" ");
		for (String s : tokenList) {
			if (isOperator(s)) {
				IExpression_1 rightExpression = (IExpression_1) stack.pop();
				IExpression_1 leftExpression = (IExpression_1) stack.pop();
				IExpression_1 operator = getOperatorInstance(s, leftExpression, rightExpression);
				int result = operator.interpret();
				stack.push(new NumberExpression_2(result));
			} else {
				IExpression_1 i = new NumberExpression_2(s);
				stack.push(i);
			}
		}
		System.out.println("Result: " + ((IExpression_1) stack.pop()).interpret());
	}

	public static boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*"))
			return true;
		else
			return false;
	}

	public static IExpression_1 getOperatorInstance(String s, IExpression_1 left, IExpression_1 right) {
		switch (s) {
		case "+":
			return new PlusExpression_4(left, right);
		case "-":
			return new MinusExpression_5(left, right);
		case "*":
			return new MultiplyExpression_3(left, right);
		}
		return null;
	}

}
