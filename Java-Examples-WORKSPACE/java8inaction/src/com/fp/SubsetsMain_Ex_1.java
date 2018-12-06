package com.fp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Given a List<Integer> value, for example, {1, 4, 9}, construct a
List<List<Integer>> value whose members are all the subsets of {1, 4, 9}—in any order. The
subsets of {1, 4, 9} are {1, 4 ,9}, {1, 4}, {1, 9}, {4, 9}, {1}, {4}, {9}, and {}.
 */
public class SubsetsMain_Ex_1 {
	public static void main(String[] args) {
		List<List<Integer>> subs = subsets(Arrays.asList(1, 4, 9));
		subs.forEach(System.out::println);
	}

	public static List<List<Integer>> subsets(List<Integer> l) {
		/*
		 * If the input list is empty, it has exactly one subset, the empty list
		 * itself!
		 */
		if (l.isEmpty()) {
			List<List<Integer>> ans = new ArrayList<>();
			ans.add(Collections.emptyList());
			return ans;
		}
		Integer first = l.get(0);
		List<Integer> rest = l.subList(1, l.size());
		/*
		 * Otherwise take one element out, first, and find all subsets of the
		 * rest to give subans; subans forms half of the answer.
		 */
		List<List<Integer>> subans = subsets(rest);
		/*
		 * The other half of the answer, subans2, consists of all the lists in
		 * subans but adjusted by prefixing each of these element lists with
		 * first
		 */
		List<List<Integer>> subans2 = insertAll(first, subans);
		/*
		 * Then concatenate the two subanswers
		 */
		return concat(subans, subans2);
	}

	public static List<List<Integer>> insertAll(Integer first, List<List<Integer>> lists) {
		List<List<Integer>> result = new ArrayList<>();
		for (List<Integer> l : lists) {
			/*
			 * Copy the list to allow you to add to it. You wouldn't copy the
			 * lower-level structure even if it were mutable (Integers are not)
			 */
			List<Integer> copyList = new ArrayList<>();
			copyList.add(first);
			copyList.addAll(l);
			result.add(copyList);
		}
		return result;
	}

	static List<List<Integer>> concat(List<List<Integer>> a, List<List<Integer>> b) {
		List<List<Integer>> r = new ArrayList<>(a);
		r.addAll(b);
		return r;
	}
}
