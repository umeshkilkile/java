package com.access.specifiers2;

/*
 * Note:
 * 	- No access specifier for class Cake
 */
class Cake {
	public static void main(String[] args) {
		Pie x = new Pie();
		x.f();
	}
}

/*
 * Cake is able to create a Pie object and call its f( ) method. You�d typically
 * think that Pie and f( ) have package access and are therefore not available
 * to Cake. They do have package access�that part is correct. The reason that
 * they are available in Cake.java is because they are in the same directory and
 * have no explicit package name. Java treats files like this as implicitly part
 * of the �default package� for that directory, and thus they provide package
 * access to all the other files in that directory.
 */