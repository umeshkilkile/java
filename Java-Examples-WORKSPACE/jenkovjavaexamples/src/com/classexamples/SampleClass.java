package com.classexamples;

public class SampleClass {
	public int num = 10;
	public static int num2 = 100;

	/*
	 * Instance block / Class Initializers
	 * 
	 * - Inside this block you can put initialization code that is to be
	 * executed a instance of the class is created
	 */
	{
		System.out.println("Instance block (executes every time a new object is created) " + num);
	}

	/*
	 * Class initializers can also be static (static block). Then they are
	 * executed already when the class is loaded, and only once because the
	 * class is only loaded in the Java Virtual Machine once.
	 */
	static {
		/*
		 * Cannot make a static reference to the non-static field num.
		 * 
		 * Change 'num' to 'static'
		 */
		// System.out.println("Static block" + num);

		System.out.println("Static block (executes only once) " + num2);
	}

	public SampleClass() {
		System.out.println("Default constructor");
	}

	SampleClass(int num, int num2) {
		System.out.println("Parameterized constructor");
		this.num = num;
		SampleClass.num2 = num2;
	}

	/*
	 * instance methods
	 */
	public void method1() {
		System.out.println(num + " : " + num2);
	}

	public int method2() {
		return num + num2;
	}

	/*
	 * A static method belongs to the class, not objects of the class. That
	 * means that you can call a static method without having an object of the
	 * class the static method belongs to.
	 * 
	 * 
	 */
	public static int method3() {
		return SampleClass.num2++;

		/*
		 * Static methods cannot make a static reference to the non-static field
		 * num
		 */
		// return SampleClass.num2++ + num;
	}

	public static void main(String[] args) {

		SampleClass obj2 = new SampleClass(10, 20);
		/*
		 * The method println(boolean) in the type PrintStream is not applicable
		 * for the arguments (void)
		 */
		// System.out.println(obj2.method1());
		System.out.println(obj2.method2());
		System.out.println(obj2.method3());
		System.out.println(SampleClass.method3());

		System.out.println("--------------");

		SampleClass obj1 = new SampleClass();
		System.out.println(obj1);

	}
}
