package static_keyword;

public class Employee {
	public String name;
	public static int age = 0;

	public static int getEmpAge() {

		// name = "Abs";//Cannot make a static reference to the non-static field
		return age;
	}

}
