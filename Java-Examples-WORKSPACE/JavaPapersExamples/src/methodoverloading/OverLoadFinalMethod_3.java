package methodoverloading;

public class OverLoadFinalMethod_3 {
	public static void main(String[] args) {
		int sumInt = add(10, 20);
		System.out.println(sumInt);
	}

	/*
	 * Test Case 2: 
	 * final: Two methods with same parameters list and in one
	 * method we have parameters ‘final’, in this case two methods are not
	 * different methods and overloading is not possible.
	 * 
	 * The below two methods are same, hence overloading is not possible.
	 */
	private static final int add(int num1, int num2) {
		return num1 + num2;

	}
	private static final int add(final int num1, final int num2) {
		return num1 + num2;
	}
}
