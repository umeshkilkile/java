package micellaneous;

public class FinalizeMethod {
	public static void main(String[] args) {
		/**
		 *  Snippet-1
		 */
		/*Employee employee = new Employee("Umesh", "Kilkile");
		System.out.println(employee);
		employee = null;
		System.gc();*/

		
		/**
		 *  Snippet-2
		 */
		/*Employee employee1 = new Employee("Umesh", "Kilkile");
		Employee employee2 = new Employee("Anand", "Navale");

		System.out.println("Before dereferencing");
		System.out.println("employee1 : " + employee1);
		System.out.println("employee2 : " + employee2);

		employee2 = employee1; 

		System.gc();
		
		
		System.out.println("After dereferencing");
		System.out.println("employee1 : " + employee1);
		System.out.println("employee2 : " + employee2);*/

		/**
		 *  Snippet-3
		 */
		Employee employee1 = new Employee("Umesh", "Kilkile");
		Employee employee2 = new Employee("Anand", "Navale");

		employee1 = null;
		employee2 = null;

		System.gc();
		System.out.println("After dereferencing with null");
		System.out.println("employee1 : " + employee1);
		System.out.println("employee2 : " + employee2);
	}
}
