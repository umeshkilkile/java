package com.designpatterns.behavioral.interpreter_17;

public class PlusExpression_4 implements IExpression_1 {
	IExpression_1 leftExpression;
	IExpression_1 rightExpresion;

	public PlusExpression_4(IExpression_1 leftExpression, IExpression_1 rightExpresion) {
		this.leftExpression = leftExpression;
		this.rightExpresion = rightExpresion;
	}

	@Override
	public int interpret() {
		return leftExpression.interpret() + rightExpresion.interpret();
	}

}
