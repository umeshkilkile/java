package covariant_return_type;

public class B extends A {
	@Override
	public B get() {
		return this;
	}

	public void message() {
		System.out.println("Simple example of Covariant Return Type");
	}
}
