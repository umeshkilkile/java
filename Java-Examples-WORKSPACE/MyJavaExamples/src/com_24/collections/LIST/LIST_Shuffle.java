package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * The following program uses this algorithm to print the words in its argument list in random order.
 */
public class LIST_Shuffle {
	public static void main(String[] args) {

		String[] arg = { "Umesh", "Subhash", "Kilkile" };
		List<String> list = new ArrayList<String>();
		for (String a : arg)
			list.add(a);
		Collections.shuffle(list, new Random());
		System.out.println(list);
	}
}
