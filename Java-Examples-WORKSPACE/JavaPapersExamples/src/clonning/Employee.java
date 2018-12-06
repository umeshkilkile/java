package clonning;

public class Employee implements Cloneable {

	private String name;
	private String designation;

	public Employee() {
		this.setDesignation("Programmer");
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Employee.clone()");
		/*
		 * Employee copyObj = new Employee();
		 * copyObj.setDesignation(this.designation); copyObj.setName(this.name);
		 * return copyObj;
		 */
		return super.clone();
	}
}
