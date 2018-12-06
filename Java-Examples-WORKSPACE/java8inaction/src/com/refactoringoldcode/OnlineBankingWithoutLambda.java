package com.refactoringoldcode;

public abstract class OnlineBankingWithoutLambda {
	public void processCustomer(int id) {
		Customer c = Database.getCustomerWithId(id);
		makeCustomerHappy(c);
	}

	abstract void makeCustomerHappy(Customer c);

	// dummy Datbase class
	static private class Database {
		static Customer getCustomerWithId(int id) {
			return new Customer("Umesh", 12345, 2000);
		}
	}
}
