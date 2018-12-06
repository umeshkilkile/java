package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingDouble;

public class Demo_2 {
	public static void main(String[] args) {
		List<Invoice> listInvoices = new ArrayList<>();
		listInvoices.add(new Invoice(100.78, "TV", 5001, "Google"));
		listInvoices.add(new Invoice(100.34, "Fridge", 5003, "Google"));
		listInvoices.add(new Invoice(100.2, "Cooler", 5002, "Apple"));
		listInvoices.add(new Invoice(1001.78, "AC", 5004, "Apple"));
		listInvoices.add(new Invoice(2001.78, "JavaTraining", 3001, "Apple"));
		listInvoices.add(new Invoice(3001.78, "NodeTraining", 4001, "Intuit"));
		listInvoices.add(new Invoice(4001.78, "Angular2Training", 2001, "Oracle"));
		listInvoices.add(new Invoice(5001.78, "Angular2Training", 8001, "Apple"));

		List<Invoice> listInvoicesGreaterThanAmount = findInvoicesGreaterThanAmount(listInvoices, 1002);

		System.out.println("Invoices with greater than 100 amount : ");
		for (Invoice inv : listInvoicesGreaterThanAmount) {
			System.out.println(inv);
		}

		List<Invoice> listInvoicesGreaterThanAmount2 = findInvoices(listInvoices,
				new InvoicePredicateGreaterThanAmountImpl(1002.00));

		System.out.println("\nJava 8 - Invoices with greater than 1002.00 amount : ");
		for (Invoice inv : listInvoicesGreaterThanAmount2) {
			System.out.println(inv);
		}

		List<Invoice> listInvoicesGreaterId2000 = findInvoices(listInvoices,
				new InvoicePredicateGreaterThanIdImpl(5001));

		System.out.println("\nJava 8 - Invoices with greater than 5001 ID : ");
		for (Invoice inv : listInvoicesGreaterId2000) {
			System.out.println(inv);
		}

		List<Invoice> expensiveInvoicesFromOracle = findInvoices(listInvoices, new InvoicePredicate() {
			@Override
			public boolean test(Invoice inv) {
				return inv.getAmount() > 4000 && inv.getCustomer().equalsIgnoreCase("Oracle");
			}
		});

		System.out.println("\nJava 8 - expensiveInvoicesFromOracle : ");
		for (Invoice inv : expensiveInvoicesFromOracle) {
			System.out.println(inv);
		}

		/*
		 * Above code using Lambda expressions.
		 * 
		 */
		List<Invoice> expensiveInvoicesFromApple = findInvoices(listInvoices,
				inv -> inv.getAmount() > 5000 && inv.getCustomer().equalsIgnoreCase("Apple"));
		System.out.println("\nJava 8 - Lambda Expressions : ");
		for (Invoice inv : expensiveInvoicesFromApple) {
			System.out.println(inv);
		}

		System.out.println("\nOtherway-1 of Lambda Expressions");
		List<Invoice> listInvoices2 = new ArrayList<>();
		listInvoices2.add(new Invoice(100.78, "TV", 5001, "Google"));
		listInvoices2.add(new Invoice(100.34, "Fridge", 5003, "Google"));
		listInvoices2.add(new Invoice(100.2, "Cooler", 5002, "Apple"));
		listInvoices2.add(new Invoice(1001.78, "AC", 5004, "Apple"));
		listInvoices2.add(new Invoice(2001.78, "JavaTraining", 3001, "Apple"));
		listInvoices2.add(new Invoice(3001.78, "NodeTraining", 4001, "Intuit"));
		listInvoices2.add(new Invoice(4001.78, "Angular2Training", 2001, "Oracle"));
		listInvoices2.add(new Invoice(5001.78, "Angular2Training", 8001, "Apple"));

		Collections.sort(listInvoices2, (Invoice inv1, Invoice inv2) -> {
			return Double.compare(inv2.getAmount(), inv1.getAmount());
		});
		for (Invoice inv : listInvoices2) {
			System.out.println(inv);
		}

		System.out.println("\nOtherway-2 of Lambda Expressions");
		List<Invoice> listInvoices3 = new ArrayList<>();
		listInvoices3.add(new Invoice(100.78, "TV", 5001, "Google"));
		listInvoices3.add(new Invoice(100.34, "Fridge", 5003, "Google"));
		listInvoices3.add(new Invoice(100.2, "Cooler", 5002, "Apple"));
		listInvoices3.add(new Invoice(1001.78, "AC", 5004, "Apple"));
		listInvoices3.add(new Invoice(2001.78, "JavaTraining", 3001, "Apple"));
		listInvoices3.add(new Invoice(3001.78, "NodeTraining", 4001, "Intuit"));
		listInvoices3.add(new Invoice(4001.78, "Angular2Training", 2001, "Oracle"));
		listInvoices3.add(new Invoice(5001.78, "Angular2Training", 8001, "Apple"));

		Collections.sort(listInvoices3,
				(Invoice inv1, Invoice inv2) -> Double.compare(inv2.getAmount(), inv1.getAmount()));
		for (Invoice inv : listInvoices3) {
			System.out.println(inv);
		}

		System.out.println("\nOtherway-3 of Lambda Expressions");
		List<Invoice> listInvoices4 = new ArrayList<>();
		listInvoices4.add(new Invoice(100.78, "TV", 5001, "Google"));
		listInvoices4.add(new Invoice(100.34, "Fridge", 5003, "Google"));
		listInvoices4.add(new Invoice(100.2, "Cooler", 5002, "Apple"));
		listInvoices4.add(new Invoice(1001.78, "AC", 5004, "Apple"));
		listInvoices4.add(new Invoice(2001.78, "JavaTraining", 3001, "Apple"));
		listInvoices4.add(new Invoice(3001.78, "NodeTraining", 4001, "Intuit"));
		listInvoices4.add(new Invoice(4001.78, "Angular2Training", 2001, "Oracle"));
		listInvoices4.add(new Invoice(5001.78, "Angular2Training", 8001, "Apple"));

		listInvoices4.sort((Invoice inv1, Invoice inv2) -> Double.compare(inv2.getAmount(), inv1.getAmount()));
		for (Invoice inv : listInvoices4) {
			System.out.println(inv);
		}

		System.out.println("\nOtherway-4 of Lambda Expressions");
		List<Invoice> listInvoices5 = new ArrayList<>();
		listInvoices5.add(new Invoice(100.78, "TV", 5001, "Google"));
		listInvoices5.add(new Invoice(100.34, "Fridge", 5003, "Google"));
		listInvoices5.add(new Invoice(100.2, "Cooler", 5002, "Apple"));
		listInvoices5.add(new Invoice(1001.78, "AC", 5004, "Apple"));
		listInvoices5.add(new Invoice(2001.78, "JavaTraining", 3001, "Apple"));
		listInvoices5.add(new Invoice(3001.78, "NodeTraining", 4001, "Intuit"));
		listInvoices5.add(new Invoice(4001.78, "Angular2Training", 2001, "Oracle"));
		listInvoices5.add(new Invoice(5001.78, "Angular2Training", 8001, "Apple"));

		Comparator<Invoice> byCustomer = Comparator.comparing((Invoice inv) -> inv.getCustomer());
		listInvoices5.sort(byCustomer);
		for (Invoice inv : listInvoices5) {
			System.out.println(inv);
		}

		System.out.println("\nOtherway-5 of Lambda Expressions");
		List<Invoice> listInvoices6 = new ArrayList<>();
		listInvoices6.add(new Invoice(100.78, "TV", 5001, "Google"));
		listInvoices6.add(new Invoice(100.34, "Fridge", 5003, "Google"));
		listInvoices6.add(new Invoice(100.2, "Cooler", 5002, "Apple"));
		listInvoices6.add(new Invoice(1001.78, "AC", 5004, "Apple"));
		listInvoices6.add(new Invoice(2001.78, "JavaTraining", 3001, "Apple"));
		listInvoices6.add(new Invoice(3001.78, "NodeTraining", 4001, "Intuit"));
		listInvoices6.add(new Invoice(4001.78, "Angular2Training", 2001, "Oracle"));
		listInvoices6.add(new Invoice(5001.78, "Angular2Training", 8001, "Apple"));

		Comparator<Invoice> byAmount = Comparator.comparing(Invoice::getAmount);
		listInvoices6.sort(byAmount);

		listInvoices6.sort(byAmount);
		for (Invoice inv : listInvoices6) {
			System.out.println(inv);
		}

		System.out.println("\nOtherway-6 of Lambda Expressions");
		List<Invoice> listInvoices7 = new ArrayList<>();
		listInvoices7.add(new Invoice(100.78, "TV", 5001, "Google"));
		listInvoices7.add(new Invoice(100.34, "Fridge", 5003, "Google"));
		listInvoices7.add(new Invoice(100.2, "Cooler", 5002, "Apple"));
		listInvoices7.add(new Invoice(1001.78, "AC", 5004, "Apple"));
		listInvoices7.add(new Invoice(2001.78, "JavaTraining", 3001, "Apple"));
		listInvoices7.add(new Invoice(3001.78, "NodeTraining", 4001, "Intuit"));
		listInvoices7.add(new Invoice(4001.78, "Angular2Training", 2001, "Oracle"));
		listInvoices7.add(new Invoice(5001.78, "Angular2Training", 8001, "Apple"));

		Comparator<Invoice> byAmount3 = Comparator.comparingDouble(Invoice::getAmount);
		listInvoices7.sort(byAmount3);

		for (Invoice inv : listInvoices7) {
			System.out.println(inv);
		}

		System.out.println("\nOtherway-7 of Lambda Expressions");
		List<Invoice> listInvoices8 = new ArrayList<>();
		listInvoices8.add(new Invoice(100.78, "TV", 5001, "Google"));
		listInvoices8.add(new Invoice(100.34, "Fridge", 5003, "Google"));
		listInvoices8.add(new Invoice(100.2, "Cooler", 5002, "Apple"));
		listInvoices8.add(new Invoice(1001.78, "AC", 5004, "Apple"));
		listInvoices8.add(new Invoice(2001.78, "JavaTraining", 3001, "Apple"));
		listInvoices8.add(new Invoice(3001.78, "NodeTraining", 4001, "Intuit"));
		listInvoices8.add(new Invoice(4001.78, "Angular2Training", 2001, "Oracle"));
		listInvoices8.add(new Invoice(5001.78, "Angular2Training", 8001, "Apple"));

		listInvoices8.sort(comparingDouble(Invoice::getAmount));

		for (Invoice inv : listInvoices8) {
			System.out.println(inv);
		}
	}

	/*
	 * Before Java 8
	 */
	public static List<Invoice> findInvoicesGreaterThanAmount(List<Invoice> invoices, double amount) {
		List<Invoice> result = new ArrayList<>();
		for (Invoice inv : invoices) {
			if (inv.getAmount() > amount) {
				result.add(inv);
			}
		}
		return result;
	}

	/*
	 * In Java 8, using Lambda expressions. Behavior parameterization
	 */
	public static List<Invoice> findInvoices(List<Invoice> invoices, InvoicePredicate p) {
		List<Invoice> result = new ArrayList<>();
		for (Invoice inv : invoices) {
			System.out.println("Demo_2.findInvoicesGreaterThanAmount()" + inv.getId());
			if (p.test(inv)) {
				result.add(inv);
			}
		}
		System.out.println(result);
		return result;
	}
}

/*
 * NOTES:
 * 
 * A lambda expression is an anonymous function that can be passed around.
 * 
 * Let’s take a look at this definition in greater detail:
 * 
 * Anonymous : A lambda expression is anonymous because it does not have an
 * explicit name as a method normally would.
 * 
 * It’s sort of like an anonymous class in that it does not have a declared
 * name.
 * 
 * Function : A lambda is like a method in that it has a list of parameters, a
 * body, a return type, and a possible list of exceptions that can be thrown.
 * However, unlike a method, it’s not declared as part of a particular class.
 * 
 * Passed around : A lambda expression can be passed as an argument to a method,
 * stored in a variable, and also returned as a result.
 */
