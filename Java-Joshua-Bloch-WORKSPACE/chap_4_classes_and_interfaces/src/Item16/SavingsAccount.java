package Item16;

public class SavingsAccount extends Account {
	private String branch;

	public SavingsAccount(String accHolderName, String accType, long accNo, String branch) {
		super(accHolderName, accType, accNo);
		this.branch = branch;

		displayAccount(accNo, accHolderName, accType, branch);
	}

}

/*
 * NOTES : 1. Unlike method invocation, inheritance violates encapsulation
 */
