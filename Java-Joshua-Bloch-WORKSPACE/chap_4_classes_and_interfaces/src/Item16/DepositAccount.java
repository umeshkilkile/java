package Item16;

public class DepositAccount {

	private Account account;// Composition

	private String branch;

	public DepositAccount(String accHolderName, String accType, long accNo, String branch) {
		this.account = new Account(accHolderName, accType, accNo);
		this.branch = branch;
		account.displayAccount(accNo, accHolderName, accType, branch);
	}

}

/*
 * NOTES
 * 
 * 1. Instead of extending an existing class, give your new class a private
 * field that references an instance of the existing class. This design is
 * called composition because the existing class becomes a component of the new
 * one.
 * 
 * 2. Each instance method in the new class invokes the corresponding method on
 * the contained instance of the existing class and returns the results. This is
 * known as forwarding, and the methods in the new class are known as forwarding
 * methods.
 * 
 * 3. The resulting class will be rock solid, with no dependencies on the
 * implementation details of the existing class. Even adding new methods to the
 * existing class will have no impact on the new class.
 * 
 * 4. Inheritance is appropriate only in circumstances where the subclass really
 * is a subtype of the superclass. In other words, a class B should extend a
 * class A only if an “is-a” relationship exists between the two classes.
 * 
 * 5. Inheritance propagates any flaws in the superclass’s API, while
 * composition lets you design a new API that hides these flaws.
 */