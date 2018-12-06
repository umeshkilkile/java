package varargs;

/**
 * 
 * @author kilkile
 *
 *         Note 1: We can have only one varargs in a method. 2: Varargs must be
 *         the last formal parameter. 3: compiler matches the argument list from
 *         left-to-right with the formal parameters. Once initial set of
 *         parameters are matched, then whatever arguments are remaining are
 *         constructed as an array and passed to the method
 * 
 *         4: java compiler removes elipsis (…) and replaces it with an array in
 *         bytecode
 */
public class VarArgSample {
	static int sum(int i, int... marks) {

		System.out.println("i : " + i);
		System.out.println("marks : " + marks);

		int total = 0;
		for (int mark : marks) {
			total = total + mark;
		}
		return total;
	}

	static int sum(float i, float... marks) {
		float sum = 0.0f;
		for (float num : marks) {
			sum += num;
		}
		System.out.println("We can overload as well. Sum is : " + sum);
		return 0;
	}

	/**
	 * main with var args
	 */
	public static void main(String... args) throws Exception {

		// invoking with variable arguments
		System.out.println("Sum (var args) : " + sum(1, 2, 3));

		// same invocation using an array
		int arr[] = { 2, 3 };
		System.out.println("Sum (array) : " + sum(1, arr));

		sum(10.10f, 1.02f, 2.3f);
	}
}
