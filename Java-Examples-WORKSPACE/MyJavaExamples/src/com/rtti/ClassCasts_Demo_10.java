package com.rtti;

public class ClassCasts_Demo_10 {
	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		System.out.println(houseType.getName());

		House h = houseType.cast(b);
		System.out.println(h.getClass().getName());

		h = (House) b; // ... or just do this.
		System.out.println(h.getClass().getName());
	}
}
/*
 * The cast( ) method takes the argument object and casts it to the type of the
 * Class reference. Of course, if you look at the above code it seems like a lot
 * of extra work compared to the last line in main( ), which does the same
 * thing.
 */