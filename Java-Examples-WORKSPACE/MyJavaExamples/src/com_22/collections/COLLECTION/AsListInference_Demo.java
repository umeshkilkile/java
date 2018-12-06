package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInference_Demo {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
		System.out.println(snow1);

		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		System.out.println(snow2);

		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		System.out.println(snow3);
		/*
		 * Give a hint using an explicit type argument specification
		 * 
		 * - As you can see from the creation of snow4, it’s possible to insert
		 * a "hint" in the middle of Arrays.asList( ), to tell the compiler what
		 * the actual target type should be for the resulting List type produced
		 * by Arrays.asList( ). This is called an explicit type argument
		 * specification.
		 */
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
		System.out.println(snow4);
	}
}
