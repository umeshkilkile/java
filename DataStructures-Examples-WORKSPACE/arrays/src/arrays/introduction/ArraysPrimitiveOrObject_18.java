package arrays.introduction;

public class ArraysPrimitiveOrObject_18 {
	public static void main(String[] args) {
		int[] x = new int[3];
		System.out.println(x.getClass().getName());

		// Object is the parent class of all classes
		// of Java. Here args is the object of String
		// class.
		System.out.println(args instanceof Object);

		int[] arr = new int[2];

		// Here arr is also an object of int class.
		System.out.println(arr instanceof Object);
	}
}

/*
 * An array in Java is an object. Now the question how is this possible? What is
 * the reason behind that? In Java, we can create arrays by using new operator
 * and we know that every object is created using new operator. Hence we can say
 * that array is also an object. Now the question also arises, every time we
 * create an object for a class then what is the class of array?
 * 
 * - In Java, there is a class for every array type, so there’s a class for
 * int[] and similarly for float, double etc.
 * 
 * - The direct superclass of an array type is Object. Every array type
 * implements the interfaces Cloneable and java.io.Serializable.
 * 
 * - In the Java programming language, arrays are objects, are dynamically
 * created, and may be assigned to variables of type Object . All methods of
 * class Object may be invoked on an array.
 * 
 * - For every array type corresponding classes are available and these classes
 * are the part of java language and not available to the programmer level.
 * 
 * - NOTE:[I this is the class for this array, one [ (square bracket) because it
 * is one dimensional and I for integer data type.
 * 
 * - Array type Corresponding class Name int[] [I int[][] [[I double[] [D
 * double[][] [[D short[] [S byte[] [B boolean[] [Z
 */
