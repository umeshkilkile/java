package com.refactoringoldcode;

import java.util.function.Consumer;

public abstract class OnlineBankingUsingLambda {
	public void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
		Customer c = Database.getCustomerWithId(id);
		makeCustomerHappy.accept(c);
	}

	// dummy Datbase class
	static private class Database {
		static Customer getCustomerWithId(int id) {
			return new Customer("Umesh", 12345, 2000);
		}
	}
}
