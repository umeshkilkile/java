package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamInRealWorld_Ex_9 {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		System.out.println("transactions = " + transactions);

		// Find all transactions in 2011 and sort by value (small to high)
		List<Transaction> tr2011 = transactions.stream().filter(transaction -> transaction.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		System.out.println("tr2011 = " + tr2011);

		// What are all the unique cities where the traders work?
		List<String> cities = transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct()
				.collect(Collectors.toList());
		System.out.println("cities = " + cities);

		Set<String> citiesSet = transactions.stream().map(transaction -> transaction.getTrader().getCity())
				.collect(Collectors.toSet());
		System.out.println("citiesSet = " + citiesSet);

		// Find all traders from Cambridge and sort them by name
		List<Trader> cambridgeTraders = transactions.stream().map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Cambridge")).distinct()
				.sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		System.out.println("cambridgeTraders = " + cambridgeTraders);

		// Return a string of all traders� names sorted alphabetically
		String traderStr = transactions.stream().map(transaction -> transaction.getTrader().getName()).distinct()
				.sorted().reduce("", (n1, n2) -> n1 + n2);
		System.out.println("traderStr = " + traderStr);
		// joining internally uses StringBuilder
		String traderStr2 = transactions.stream().map(transaction -> transaction.getTrader().getName()).distinct()
				.sorted().collect(Collectors.joining());
		System.out.println("traderStr2 = " + traderStr2);

		// Are any traders based in Milan?
		boolean milanBased = transactions.stream()
				.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
		System.out.println("milanBased = " + milanBased);

		// Print all transactions� values from the traders living in Cambridge
		transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity())).map(Transaction::getValue)
				.forEach(System.out::println);

		// What�s the highest value of all the transactions?
		Optional<Integer> highestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
		System.out.println("highestValue = " + highestValue.get());

		// Find the transaction with the smallest value
		Optional<Transaction> smallestTransaction = transactions.stream()
				.reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
		System.out.println("smallestTransaction = " + smallestTransaction.get());

		Optional<Transaction> smallestTransaction2 = transactions.stream()
				.min(Comparator.comparing(Transaction::getValue));
		System.out.println("smallestTransaction2 = " + smallestTransaction2.get());
	}
}
