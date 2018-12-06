package com_6.operators;

/*
 * When you assign objects, however, things change. Whenever you manipulate an object, what you’re manipulating is 
 * the reference, so when you assign “from one object to another,” you’re actually copying a reference from one place 
 * to another. This means that if you say c = d for objects, you end up with both c and d pointing to the object that, 
 * originally, only d pointed to. Here’s an example that demonstrates this behavior:
 */
public class Assignment_Demo {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);

		t1 = t2;
		System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);

		t1.level = 27;
		System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);

		t2.level = 37;
		System.out.println("4: t1.level: " + t1.level + ", t2.level: " + t2.level);
	}
}
/*
 * This phenomenon is often called aliasing, and it’s a fundamental way that
 * Java works with objects.
 */