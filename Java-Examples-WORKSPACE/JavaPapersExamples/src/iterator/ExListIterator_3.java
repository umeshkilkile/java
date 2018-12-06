package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExListIterator_3 {
	public static void main(String[] args) {
		List<String> listAnimals = new ArrayList<String>();
		listAnimals.add("Horse");
		listAnimals.add("Chhetha");
		listAnimals.add("Zebra");
		
		 ListIterator<String> listIteratorAnimal =  listAnimals.listIterator();
		 while(listIteratorAnimal.hasNext()){
			 System.out.println(listIteratorAnimal.next());
			 
			 System.out.println(listIteratorAnimal.nextIndex());
		 }
	}
}
