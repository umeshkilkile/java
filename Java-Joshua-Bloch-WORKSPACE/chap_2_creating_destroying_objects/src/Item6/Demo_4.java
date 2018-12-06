package Item6;

/**
 * 
 * @author kilkile
 *
 *         Prefer primitives to boxed primitives, and watch out for
 *         unintentional autoboxing.
 */
public class Demo_4 {

	public static void main(String[] args) {

		// Hideously slow program! Can you spot the object creation?
		long startTime = System.currentTimeMillis();
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("Total time took using Autoboxing : " + (System.currentTimeMillis() - startTime));

		// Better way
		long startTime1 = System.currentTimeMillis();
		long sum1 = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		System.out.println("Total time took primitives: " + (System.currentTimeMillis() - startTime1));
	}
}

/*
 * NOTE : This program gets the right answer, but it is much slower than it
 * should be, due to a one-character typographical error. The variable sum is
 * declared as a Long instead of a long, which means that the program constructs
 * about 231 (2 to the power of 31) unnecessary Long instances (roughly one for
 * each time the long i is added to the Long sum).
 * 
 * - Another way to create unnecessary objects is autoboxing, which allows the
 * programmer to mix primitive and boxed primitive types, boxing and unboxing
 * automatically as needed. Autoboxing blurs but does not erase the distinction
 * between primitive and boxed primitive types.
 * 
 * - The lesson is clear: prefer primitives to boxed primitives, and watch out
 * for unintentional autoboxing.
 * 
 * - Conversely, avoiding object creation by maintaining your own object pool is
 * a bad idea unless the objects in the pool are extremely heavyweight. The
 * classic example of an object that does justify an object pool is a database
 * connection. The cost of establishing the connection is sufficiently high that
 * it makes sense to reuse these objects. Generally speaking, however,
 * maintaining your own object pools clutters your code, increases memory
 * footprint, and harms performance. Modern JVM implementations have highly
 * optimized garbage collectors that easily outperform such object pools on
 * lightweight objects.
 */
