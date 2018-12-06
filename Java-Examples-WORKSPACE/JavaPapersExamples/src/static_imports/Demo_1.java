package static_imports;

import static java.util.Collections.sort;

import java.util.Arrays;
import java.util.List;

public class Demo_1 {
	public static void main(String[] args) {

		Integer[] i = { 10, 30, 50, 6, 2 };
		List<Integer> listInt = Arrays.asList(i);
		System.out.println(listInt.toString());

		/**
		 * If not used static import
		 */

		/*
		 * Collections.sort(listInt); System.out.println(listInt);
		 */

		/**
		 * With static import
		 */
		sort(listInt);
		System.out.println(listInt);

	}
}
