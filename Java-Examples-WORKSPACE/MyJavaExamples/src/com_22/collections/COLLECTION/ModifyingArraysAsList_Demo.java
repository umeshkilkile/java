package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ModifyingArraysAsList_Demo {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] ia = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
		System.out.println("Before shuffling: " + list1);
		Collections.shuffle(list1, rand);
		System.out.println("After shuffling: " + list1);
		System.out.println("array: " + Arrays.toString(ia));
		List<Integer> list2 = Arrays.asList(ia);
		System.out.println("Before shuffling: " + list2);
		Collections.shuffle(list2, rand);
		System.out.println("After shuffling: " + list2);
		System.out.println("array: " + Arrays.toString(ia));
	}
}
/*
 * In the first case, the output of Arrays.asList( ) is handed to the ArrayList(
 * ) constructor, and this creates an ArrayList that references the elements of
 * ia. Shuffling these references doesn�t modify the array. However, if you use
 * the result of Arrays.asList(ia) directly, shuffling modifies the order of ia.
 * It�s important to be aware that Arrays.asList( ) produces a List object that
 * uses the underlying array as its physical implementation. If you do anything
 * to that List that modifies it, and you don�t want the original array
 * modified, you should make a copy into another container.
 */
