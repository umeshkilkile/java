package micellaneous;

public class CopyConstructor_Ex {

	private String firstName, lastName;

	/*
	 * Default constructor
	 */
	CopyConstructor_Ex() {
	}

	/*
	 * Parameterized constructor
	 */
	CopyConstructor_Ex(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/*
	 * Copy constructor
	 */
	CopyConstructor_Ex(CopyConstructor_Ex c1) {
		this.firstName = c1.firstName;
		this.lastName = c1.lastName;
	}

	@Override
	public String toString() {
		return firstName + " : " + lastName;
	}

}
