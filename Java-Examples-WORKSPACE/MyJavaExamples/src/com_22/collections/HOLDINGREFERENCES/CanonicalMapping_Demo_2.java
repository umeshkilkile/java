package com_22.collections.HOLDINGREFERENCES;

import java.util.WeakHashMap;

public class CanonicalMapping_Demo_2 {
	public static void main(String[] args) {
		int size = 1000;
		// Or, choose size via the command line:
		if (args.length > 0)
			size = new Integer(args[0]);
		Key[] keys = new Key[size];
		WeakHashMap<Key, Value> map = new WeakHashMap<Key, Value>();
		for (int i = 0; i < size; i++) {
			Key k = new Key(Integer.toString(i));
			Value v = new Value(Integer.toString(i));
			if (i % 3 == 0)
				keys[i] = k; // Save as "real" references
			map.put(k, v);
		}
		System.gc();
	}
}
