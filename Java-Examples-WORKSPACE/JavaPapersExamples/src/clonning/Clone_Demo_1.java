package clonning;

public class Clone_Demo_1 {
	public static void main(String arg[]) {
		Employee emp = new Employee();
		emp.setName("Umesh S Kilkile");
		emp.setDesignation("Software Architect");

		try {
			Employee clonedEmp = (Employee) emp.clone();
			System.out.println("clonedEmp - " + clonedEmp.getName());
			System.out.println("clonedEmp - " + clonedEmp.getDesignation());
		} catch (CloneNotSupportedException cnse) {
			System.out.println("Cloneable should be implemented. " + cnse);
		}
	}

}
