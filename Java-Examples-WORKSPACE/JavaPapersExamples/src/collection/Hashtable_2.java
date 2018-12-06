package collection;

import java.util.Hashtable;

public class Hashtable_2 {
	public static void main(String[] args) {
		/**
		 * 1. HashMap allows null values as key and value whereas Hashtable doesn’t allow nulls
		 */
		Hashtable<Integer, String> hashtable = new Hashtable<Integer,String>();
		hashtable.put(null, "Paris");
		System.out.println(hashtable);
		
		
	}
}
