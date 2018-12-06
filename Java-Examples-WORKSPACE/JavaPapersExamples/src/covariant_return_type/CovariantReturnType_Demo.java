package covariant_return_type;

public class CovariantReturnType_Demo {
	public static void main(String[] args) {

		/*
		 * As you can see in the below example, the return type of the get()
		 * method of A class is A but the return type of the get() method of B
		 * class is B. Both methods have different return type but it is method
		 * overriding. This is known as covariant return type.
		 */
		new B().get().message();
	}
}

/*
 * NOTES:
 * 
 * The covariant return type specifies that the return type may vary in the same
 * direction as the subclass.
 * 
 * Before Java5, it was not possible to override any method by changing the
 * return type. But now, since Java5, it is possible to override method by
 * changing the return type if subclass overrides any method whose return type
 * is Non-Primitive but it changes its return type to subclass type.
 */