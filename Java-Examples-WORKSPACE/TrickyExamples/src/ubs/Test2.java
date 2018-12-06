package ubs;

import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) throws Exception {
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>();
		t.add(new StringBuffer("H"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("C"));
		t.add(new StringBuffer("K"));
		System.out.println(t);

	}
}
