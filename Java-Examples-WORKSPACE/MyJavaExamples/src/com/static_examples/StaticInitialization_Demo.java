package com.static_examples;

public class StaticInitialization_Demo {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}

	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}
/*
 * - static data initialization
 * 
 * - There’s only a single piece of storage for a static, regardless of how many
 * objects are created. You can’t apply the static keyword to local variables,
 * so it only applies to fields. If a field is a static primitive and you don’t
 * initialize it, it gets the standard initial value for its type. If it’s a
 * reference to an object, the default initialization value is null.
 * 
 * - The order of initialization is statics first, if they haven’t already been
 * initialized by a previous object creation, and then the non-static objects.
 * You can see the evidence of this in the output. To execute main( ) (a static
 * method), the StaticInitialization class must be loaded, and its static fields
 * table and cupboard are then initialized, which causes those classes to be
 * loaded, and since they both contain static Bowl objects, Bowl is then loaded.
 * Thus, all the classes in this particular program get loaded before main( )
 * starts. This is usually not the case, because in typical programs you won’t
 * have everything linked together by statics as you do in this example.
 */