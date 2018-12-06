package arrays.introduction;

/*
 * An array of objects is created just like an array of primitive type data items
 */
public class ArrayOfObjects_6 {
	public static void main(String[] args) {
		// declares an Array of integers.
		Student[] arr;

		// allocating memory for 5 objects of type Student.
		arr = new Student[5];

		/*
		 * The studentArray contains five memory spaces each of size of student
		 * class in which the address of seven Student objects can be stored.The
		 * Student objects have to be instantiated using the constructor of the
		 * Student class and their references should be assigned to the array
		 * elements
		 */

		// initialize the first elements of the array
		arr[0] = new Student(1, "aman");

		// initialize the second elements of the array
		arr[1] = new Student(2, "vaibhav");

		// so on...
		arr[2] = new Student(3, "shikar");
		arr[3] = new Student(4, "dharmesh");
		arr[4] = new Student(5, "mohit");

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].roll_no + " " + arr[i].name);
	}
}
