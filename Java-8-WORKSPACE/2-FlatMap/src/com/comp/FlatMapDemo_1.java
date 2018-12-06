package com.comp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced 
 * by applying the provided mapping function to each element…
 */
public class FlatMapDemo_1 {
	public static void main(String args[]) {
		List<Zoo> zooList = new ArrayList<>();

		Zoo nationalZoo = new Zoo("National");
		nationalZoo.add("Lion");
		nationalZoo.add("Tiger");
		nationalZoo.add("Peacock");
		nationalZoo.add("Gorilla");

		Zoo aCountyZoo = new Zoo("Wills County");
		aCountyZoo.add("Peacock");
		aCountyZoo.add("Camelion");

		zooList.add(nationalZoo);
		zooList.add(aCountyZoo);

		// to get the aggregate
		List<String> animalList = zooList.stream().flatMap(element -> element.getAnimals().stream())
				.collect(Collectors.toList());
		System.out.println("animalList : " + animalList);

		// to get the unique set
		Set<String> animalSet = zooList.stream().flatMap(element -> element.getAnimals().stream())
				.collect(Collectors.toSet());
		System.out.println("animalSet : " + animalSet);

	}
}
