package com.comp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_Reduce_Demo_6 {
	public static void main(String[] args) {
		List<Invoice> listInvoices = new ArrayList<>();
		listInvoices.add(new Invoice(100453.78, "TV", 5001, "Lowe's"));
		listInvoices.add(new Invoice(1003.34, "Fridge", 5003, "Lowe's"));
		listInvoices.add(new Invoice(100124.2, "Cooler", 5002, "Lowe's"));
		listInvoices.add(new Invoice(10014.78, "AC", 5004, "Menards"));
		listInvoices.add(new Invoice(10014.78, "JavaTraining", 3001, "Home Depot"));
		listInvoices.add(new Invoice(10014.78, "JavaTraining", 3001, "Home Depot"));
		listInvoices.add(new Invoice(1001.78, "NodeTraining", 4001, "Amazon"));
		listInvoices.add(new Invoice(1001.78, "Angular2Training", 2001, "Amazon"));

		List<Integer> numbers = Arrays.asList(1, 2, 3);

		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("sum : " + sum);

		int product = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println("product : " + product);

		int max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("max : " + max);


		double doubleSum = listInvoices.stream().filter(o -> o.getAmount() > 0).mapToDouble(o -> o.amount).sum();
		
		System.out.println("doubleSum = " + doubleSum);
	}
}
