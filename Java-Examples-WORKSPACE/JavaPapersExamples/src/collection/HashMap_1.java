package collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMap_1 {
	public static void main(String[] args) {

		/**
		 * 1. HashMap will not store duplicates keys.
		 */
		/*HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Paris");
		map.put(1, "Berlin");
		map.put(1, "Amsterdam");
		System.out.println(map);*/
		
		/**
		 * 2. HashMap allows one null key and any number of null values.
		 */
		HashMap map2 = new HashMap();
		map2.put(null, "Paris");
		map2.put("Paris", null);
		map2.put(null, null);
		System.out.println(map2);
		
		
	}
}
