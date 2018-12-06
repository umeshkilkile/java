package com.rtti;

import java.lang.reflect.Field;

public class ModifyingPrivateFields_Demo_18 {
	public static void main(String[] args) throws Exception {
		WithPrivateFinalField pf = new WithPrivateFinalField();
		System.out.println(pf);
		Field f = pf.getClass().getDeclaredField("i");
		f.setAccessible(true);
		System.out.println("f.getInt(pf): " + f.getInt(pf));
		f.setInt(pf, 47);
		System.out.println(pf);
		f = pf.getClass().getDeclaredField("s");
		f.setAccessible(true);
		System.out.println("f.get(pf): " + f.get(pf));
		f.set(pf, "No, you�re not!");
		System.out.println(pf);
		f = pf.getClass().getDeclaredField("s2");
		f.setAccessible(true);
		System.out.println("f.get(pf): " + f.get(pf));
		f.set(pf, "No, you�re not!");
		System.out.println(pf);
	}
}

/*
 * However, final fields are actually safe from change. The runtime system
 * accepts any attempts at change without complaint, but nothing actually
 * happens.
 */
