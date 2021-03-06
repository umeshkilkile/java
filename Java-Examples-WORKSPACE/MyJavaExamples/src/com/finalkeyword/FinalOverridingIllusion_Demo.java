package com.finalkeyword;

public class FinalOverridingIllusion_Demo {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// You can upcast:
		OverridingPrivate op = op2;
		// But you can�t call the methods:
		// ! op.f();
		// ! op.g();
		// Same here:
		WithFinals wf = op2;
		// ! wf.f();
		// ! wf.g();
	}
}

/*
 * final and private
 * 
 * - Any private methods in a class are implicitly final. Because you can�t
 * access a private method, you can�t override it. You can add the final
 * specifier to a private method, but it doesn�t give that method any extra
 * meaning.
 * 
 * - �Overriding� can only occur if something is part of the base-class
 * interface. That is, you must be able to upcast an object to its base type and
 * call the same method (the point of this will become clear in the next
 * chapter). If a method is private, it isn�t part of the base-class interface.
 * It is just some code that�s hidden away inside the class, and it just happens
 * to have that name, but if you create a public, protected, or package-access
 * method with the same name in the derived class, there�s no connection to the
 * method that might happen to have that name in the base class. You haven�t
 * overridden the method; you�ve just created a new method. Since a private
 * method is unreachable and effectively invisible, it doesn�t factor into
 * anything except for the code organization of the class for which it was
 * defined.
 */