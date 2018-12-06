package typecasting;

public class ReferenceConversion_Demo_3 {
	public static void main(String[] args) {
		Car car = new Car();
		Mercedes mercedes = new Mercedes();
		Audi audi = new Audi();

		/**
		 * Snippet-1 : Upcast : Casting a subtype object into a supertype and
		 * this is called upcast. In Java, we need not add an explicit cast and
		 * you can assign the object directly. Compiler will understand and cast
		 * the value to supertype. By doing this, we are lifting an object to a
		 * generic level. If we prefer, we can add an explicit cast and no
		 * issues
		 */
		mercedes = audi;// or mercedes = (Mercedes) audi;
		System.out.println(mercedes);

		car = mercedes;
		System.out.println(car);

		Object object = car;
		System.out.println(object);

		/**
		 * Snippet-1 : Downcast : Casting a supertype to a subtype is called
		 * downcast. This is the mostly done cast. By doing this we are telling
		 * the compiler that the value stored in the base object is of a super
		 * type. Then we are asking the runtime to assign the value. Because of
		 * downcast we get access to methods of the subtype on that object. We
		 * get ClassCastException in a downcast
		 */
		// mercedes = car;//Compiler error : Type mismatch: cannot convert from
		// Car to Mercedes. Explicit cast is required
		// mercedes = (Mercedes) car; //Runtime error :
		// java.lang.ClassCastException
		// System.out.println(mercedes);

	}
}
