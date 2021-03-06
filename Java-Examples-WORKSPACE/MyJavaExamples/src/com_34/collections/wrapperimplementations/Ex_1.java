package com_34.collections.wrapperimplementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex_1 {
	public static void main(String[] args) {
		List<String> notThreadSafeList = new ArrayList<String>();
		
		notThreadSafeList.add("Umesh");
		notThreadSafeList.add("Anand");
		notThreadSafeList.add("Ramesh");
		System.out.println(notThreadSafeList);
		/**
		 * Synchronization wrappers
		 */
		/*
		 * A collection created in this fashion is every bit as thread-safe as a
		 * normally synchronized collection
		 */
		List<String> threadSafeList = Collections.synchronizedList(notThreadSafeList);
		System.out.println(threadSafeList);
		synchronized (threadSafeList) {
			for(String s : threadSafeList){
				System.out.println(s);
			}
		}
		
		/**
		 * Unmodifiable wrappers
		 */
		
		List<String> unmodifiableList = Collections.unmodifiableList(notThreadSafeList);
		System.out.println("Unmodifiable list : " + unmodifiableList);
		unmodifiableList.add("Sometext");
	}
}
