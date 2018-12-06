package com.designpatterns.behavioral.interpreter_17;

public class MultiplyExpression_3 implements IExpression_1 {

	IExpression_1 leftExpression;
	IExpression_1 rightExpresion;

	public MultiplyExpression_3(IExpression_1 leftExpression, IExpression_1 rightExpresion) {
		this.leftExpression = leftExpression;
		this.rightExpresion = rightExpresion;
	}

	@Override
	public int interpret() {
		return leftExpression.interpret() * rightExpresion.interpret();
	}

}
