package com_19.string;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion_14 {
	public String toString() {
		// return " InfiniteRecursion address: " + this + "\n";
		return super.toString();
	}

	public static void main(String[] args) {
		List<InfiniteRecursion_14> v = new ArrayList<InfiniteRecursion_14>();
		for (int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion_14());
		System.out.println(v);
	}
}
/*
 * When you say:
 * 
 * "InfiniteRecursion address: " + this
 * 
 * The compiler sees a String followed by a�+� and something that�s not a
 * String, so it tries to convert this to a String. It does this conversion by
 * calling toString( ), which produces a recursive call.
 * 
 * If you really do want to print the address of the object, the solution is to
 * call the ObjecttoString( ) method, which does just that. So instead of saying
 * this, you�d say super.toString().
 */