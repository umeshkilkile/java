package com.designpatterns.behavioral.interpreter_17;

public class MinusExpression_5 implements IExpression_1 {
	IExpression_1 leftExpression;
	IExpression_1 rightExpresion;

	public MinusExpression_5(IExpression_1 leftExpression, IExpression_1 rightExpresion) {
		this.leftExpression = leftExpression;
		this.rightExpresion = rightExpresion;
	}

	@Override
	public int interpret() {
		return leftExpression.interpret() - rightExpresion.interpret();
	}

}
