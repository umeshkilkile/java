package com_11.methodreferences;


import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class MethodReferences_DEMO_1 {

	// The method transferElements copies elements from one collection to another

	public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(SOURCE sourceCollection, Supplier<DEST> collectionFactory) {

		DEST result = collectionFactory.get();
		for (T t : sourceCollection) {
			result.add(t);
		}
		return result;
	}

	public static void main(String... args) {

		List<Person> roster = Person.createRoster();

		System.out.println("Before sort");
		for (Person p : roster) {
			p.printPerson();
		}
		
		Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);

		/*
		 * Approach-1 : Suppose that the members of your social networking application are contained in an array, 
		 * and you want to sort the array by age
		 */
		/*
		
		class PersonAgeComparator implements Comparator<Person> {
			public int compare(Person a, Person b) {
				return a.getBirthday().compareTo(b.getBirthday());
			}
		}
		// Without method reference
		Arrays.sort(rosterAsArray, new PersonAgeComparator());
		System.out.println("\nAfter sort using - Without method reference ");
		for (Person p : rosterAsArray) {
			p.printPerson();
		}
		//Approach-1 : ENDS
		*/
		
		/*
		 * Approach-2 : With lambda expression
		 */
		/*Arrays.sort(rosterAsArray, (Person a, Person b) -> {
			return a.getBirthday().compareTo(b.getBirthday());
		});
		System.out.println("\nAfter sort using -  With lambda expression Ex-1");
		for (Person p : rosterAsArray) {
			p.printPerson();
		}*/
		//Approach-2 : ENDS
		
		/*
		 * Approach-3 : With lambda expression
		 */
		/*Arrays.sort(rosterAsArray, (a,b) -> Person.compareByAge(a, b));
		System.out.println("\nAfter sort using -  With lambda expression Ex-2");
		for (Person p : rosterAsArray) {
			p.printPerson();
		}*/
		//Approach-3 : ENDS
		
		/*
		 *  Approach-4 : With method reference. 
		 *  
		 *  Method reference kind 1 : Reference to a Static Method (E.g., Person::compareByAge)
		 */
		/*Arrays.sort(rosterAsArray, Person::compareByAge);
		System.out.println("\nAfter sort using -  With method reference. Reference to a Static Method ");
		for (Person p : rosterAsArray) {
			p.printPerson();
		}*/
		//Approach-4 : ENDS
		
		/*
		 *  Approach-5 : Reference to an instance method of a particular object
		 *  Method reference kind 2 : Reference to an Instance Method of a Particular Object
		 */
		/*class ComparisonProvider {
			public int compareByName(Person a, Person b) {
				return a.getName().compareTo(b.getName());
			}

			public int compareByAge(Person a, Person b) {
				return a.getBirthday().compareTo(b.getBirthday());
			}
		}
		ComparisonProvider myComparisonProvider = new ComparisonProvider();
		Arrays.sort(rosterAsArray, myComparisonProvider::compareByName);

		System.out.println("\nAfter sort by NAME using -  With method reference. Reference to a Static Method ");
		for (Person p : rosterAsArray) {
			p.printPerson();
		}
		
		Arrays.sort(rosterAsArray, myComparisonProvider::compareByAge);

		System.out.println("\nAfter sort by AGE using -  With method reference. Reference to a Static Method ");
		for (Person p : rosterAsArray) {
			p.printPerson();
		}*/
		//Approach-5 : ENDS
		
		/* 
		 * Approach-6 :Reference to an Instance Method of an Arbitrary Object of a Particular Type
		 * 
		 * Method reference kind 3 : Reference to an Instance Method of an Arbitrary Object of a Particular Type
		 */
		/*String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		
		System.out.println("\nAfter sort ");
		for(String s : stringArray){
			System.out.println(s);
		}*/
		//Approach-6 : ENDS
		
		/*
		 * Approach-7 : Reference to a Constructor
		 * Method reference kind 4 : Reference to a Constructor
		 */
		Set<Person> rosterSetLambda = transferElements(roster, () -> {	return new HashSet<>();	});
		System.out.println("\nLIST -> to -> Set");
		for (Person p : rosterSetLambda) {
			p.printPerson();
		}

		Set<Person> rosterSet = transferElements(roster, HashSet::new);
		System.out.println("\n\nPrinting rosterSet:");
		rosterSet.stream().forEach(p -> p.printPerson());
		//Approach-7 : ENDS
	}
}
