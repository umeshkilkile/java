package com_21.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

//Utilities to simplify generic container creation by using type argument inference.
public class TypeArgumentInference_Demo_23 {
	public static <K, V> Map<K, V> map() {
		return new HashMap<K, V>();
	}

	public static <T> List<T> list() {
		return new ArrayList<T>();
	}

	public static <T> LinkedList<T> lList() {
		return new LinkedList<T>();
	}

	public static <T> Set<T> set() {
		return new HashSet<T>();
	}

	public static <T> Queue<T> queue() {
		return new LinkedList<T>();
	}

	// Examples:
	public static void main(String[] args) {
		Map<String, List<String>> sls = TypeArgumentInference_Demo_23.map();
		List<String> ls = TypeArgumentInference_Demo_23.list();
		LinkedList<String> lls = TypeArgumentInference_Demo_23.lList();
		Set<String> ss = TypeArgumentInference_Demo_23.set();
		Queue<String> qs = TypeArgumentInference_Demo_23.queue();
	}
}
