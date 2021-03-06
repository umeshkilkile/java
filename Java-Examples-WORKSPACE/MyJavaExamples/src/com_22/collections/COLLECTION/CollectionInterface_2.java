package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/*
 * The Collection interface is used to pass around collections of objects where maximum generality is desired
 */
public class CollectionInterface_2 {
	public static void main(String[] args) {
		Collection<String> arrayList = new ArrayList<String>();
		arrayList.add("Umesh");
		arrayList.add("Anand");
		genericPrintService(arrayList);
		
		Collection<String> linkedList = new LinkedList<String>();
		linkedList.add("HP");
		linkedList.add("Dell");
		linkedList.addAll(arrayList);
		genericPrintService(linkedList);
		
		Collection<String> vector = new Vector<String>();
		vector.add("Yahoo");
		vector.add("Google");
		vector.addAll(linkedList);
		genericPrintService(vector);
		
		Collection<String> stack = new Stack<String>();
		stack.add("Intuit");
		stack.add("KPMG");
		stack.addAll(linkedList);
		genericPrintService(stack);
		
		
		Collection<String> hashSet = new HashSet<String>();
		hashSet.add("NASA");
		hashSet.add("ISRO");
		hashSet.addAll(vector);
		genericPrintService(hashSet);
		
		Collection<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("NASA");
		linkedHashSet.add("ISRO");
		linkedHashSet.addAll(hashSet);
		genericPrintService(linkedHashSet);
	}
	
	public static void  genericPrintService(Collection<String> elements){
		for(String str : elements){
			System.out.println(str);
		}
		System.out.println();
	}
}
