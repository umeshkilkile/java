package methodoverloading;

public class NullArgumentOverloading_1 {
	public static void main(String[] args) {
		NullArgumentOverloading_1 obj = new NullArgumentOverloading_1();
		obj.overLoad(null);
		obj.overLoad(obj);
		obj.overload("Umesh");
		obj.overload("Umesh", "Amadeus");
		obj.overLoad(10);

		Integer integer = new Integer("100");
		obj.overLoad(integer);
	}

	private void overLoad(Object o) {
		System.out.println("Object o argument method -> " + o);
	}

	private void overLoad(double[] dArray) {
		System.out.println("double array argument method -> " + dArray);
	}

	private void overload(String str) {
		System.out.println("String str argument method");
	}

	private void overload(String... strVarArgs) {
		System.out.println("String strVarArgs argument method");
	}

	private void overload(int i) {
		System.out.println("int argument method -> " + i);
	}

	private void overload(Integer integer) {
		System.out.println("Integer argument method -> " + integer);
	}
}
