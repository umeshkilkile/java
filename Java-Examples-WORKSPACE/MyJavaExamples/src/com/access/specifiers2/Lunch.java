package com.access.specifiers2;

//Only one public class allowed per file
public class Lunch {
	void testPrivate() {
		// Can’t do this! Private constructor:
		// ! Soup1 soup = new Soup1();
	}

	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
	}

	void testSingleton() {
		Soup2.access().f();
	}
}

/*
 * If you don’t put an access specifier for class access, it defaults to package
 * access. This means that an object of that class can be created by any other
 * class in the package, but not outside the package. (Remember, all the files
 * within the same directory that don’t have explicit package declarations are
 * implicitly part of the default package for that directory.) However, if a
 * static member of that class is public, the client programmer can still access
 * that static member even though they cannot create an object of that class.
 */