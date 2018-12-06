package com_21.generics;

public class Util {
	public static <K, V> boolean compare(Pair_2<K, V> p1, Pair_2<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
}
