package com_10.lambdaexpressions;

import java.util.function.Consumer;

public class LambdaScopeTest_DEMO_3 {
	public int x = 0;

	class FirstLevel {

		public int x = 1;

		void methodInFirstLevel(int x) {

			// The following statement causes the compiler to generate
			// the error "local variables referenced from a lambda expression
			// must be final or effectively final" in statement A:
			//
			// x = 99;

			Consumer<Integer> myConsumer = (y) -> {
				System.out.println("x = " + x); // Statement A
				System.out.println("y = " + y);
				System.out.println("this.x = " + this.x);
				System.out.println("LambdaScopeTest.this.x = " + LambdaScopeTest_DEMO_3.this.x);
			};

			myConsumer.accept(x);

		}
	}

	public static void main(String... args) {
		LambdaScopeTest_DEMO_3 st = new LambdaScopeTest_DEMO_3();
		LambdaScopeTest_DEMO_3.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}
