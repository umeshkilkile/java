package com.comp;

import static java.util.Comparator.comparingDouble;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_PutAllTogether_WithJava8_Demo_9 {
	public static void main(String[] args) {
		List<Invoice> listInvoices = new ArrayList<>();
		listInvoices.add(new Invoice(100453.78, "TV", 5001, "Lowe's"));
		listInvoices.add(new Invoice(1003.34, "Fridge", 5003, "Lowe's"));
		listInvoices.add(new Invoice(100124.2, "Cooler", 5002, "Lowe's"));
		listInvoices.add(new Invoice(10014.78, "AC", 5004, "Menards"));
		listInvoices.add(new Invoice(10014.78, "JavaTraining", 3001, "Home Depot"));
		listInvoices.add(new Invoice(10014.78, "JavaTraining", 3001, "Home Depot"));
		listInvoices.add(new Invoice(1001.78, "NodeTraining", 4001, "Oracle"));
		listInvoices.add(new Invoice(1001.78, "Angular2Training", 2001, "Oracle"));

		Stream<Invoice> oracleAndTrainingInvoices = listInvoices.stream()
				.filter(inv -> inv.getCustomer().equalsIgnoreCase("Oracle"))
				.filter(inv -> inv.getTitle().contains("Training"));

		Stream<Invoice> sortedInvoices = oracleAndTrainingInvoices.sorted(comparingDouble(Invoice::getAmount));

		Stream<Integer> ids = sortedInvoices.map(Invoice::getId);

		/*
		 * Put all together
		 */
		List<Integer> firstFiveIds = listInvoices.stream().filter(inv -> inv.getCustomer().equalsIgnoreCase("Oracle"))
				.filter(inv -> inv.getTitle().contains("Training")).sorted(comparingDouble(Invoice::getAmount))
				.map(Invoice::getId).limit(5).collect(Collectors.toList());
		
		System.out.println(firstFiveIds);
	}
}
