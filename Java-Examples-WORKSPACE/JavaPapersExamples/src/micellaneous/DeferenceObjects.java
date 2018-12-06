package micellaneous;

public class DeferenceObjects {
	public static void main(String[] a) {
		Employee employee1 = new Employee("Umesh", "Kilkile");
		Employee employee2 = new Employee("Anand", "Navale");

		System.out.println("Before dereferencing");
		System.out.println("employee1 : " + employee1);
		System.out.println("employee2 : " + employee2);

		employee2 = employee1; // employee1 is assigned to employee2, hence
								// employee2 is dereferenced

		System.out.println("After dereferencing");
		System.out.println("employee1 : " + employee1);
		System.out.println("employee2 : " + employee2);
		
		employee1 = null;
		employee2 = null;
		
		System.out.println("After dereferencing with null");
		System.out.println("employee1 : " + employee1);
		System.out.println("employee2 : " + employee2);
	}
}
