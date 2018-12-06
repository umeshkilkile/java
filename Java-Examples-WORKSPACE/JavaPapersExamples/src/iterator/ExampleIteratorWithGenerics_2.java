package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIteratorWithGenerics_2 {
	public static void main(String[] args) {
		List<String> listAnimals = new ArrayList<String>();
		listAnimals.add("Elephant");
		listAnimals.add("Lion");
		listAnimals.add("Bear");

		for (String animal : listAnimals) {
			System.out.println(animal);
		}

		Iterator<String> animalIterator = listAnimals.iterator();
		while (animalIterator.hasNext()) {

			String s = animalIterator.next();
			System.out.println(s);
			if (s.equalsIgnoreCase("lion")) {
				animalIterator.remove();
				System.out.println(s + " Removed using remove method");
			}
			
		}
	}
}
