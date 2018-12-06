package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIteratorWithOutGenerics_1 {
	public static void main(String[] args) {
		List animal = new ArrayList();
		animal.add("Horse");
		animal.add("Lion");
		animal.add("Tiger");
		
		Iterator animalIterator = animal.iterator();
		while(animalIterator.hasNext()){
			String animalObj = (String) animalIterator.next();
			System.out.println(animalObj);
		}
	}
}
