package com_21.generics;

import java.util.ArrayList;

public class ErasedTypeEquivalence_Demo_25 {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);

	}
}
/*
 * ArrayList<String> and ArrayList<Integer> could easily be argued to be
 * distinct types. Different types behave differently, and if you try, for
 * example, to put an Integer into an ArrayList<String>, you get different
 * behavior (it fails) than if you put an Integer into an ArrayList< Integer >
 * (it succeeds). And yet the above program suggests that they are the same
 * type.
 */