package com.reusing.classes;

public class Car_Demo {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(), right = new Door(); // 2-door

	public Car_Demo() {
		for (int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
	}

	public static void main(String[] args) {
		Car_Demo car = new Car_Demo();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
	}
}
/*
 * Choosing composition vs. inheritance
 * 
 * - Both composition and inheritance allow you to place subobjects inside your
 * new class (composition explicitly does this—with inheritance it’s implicit).
 * 
 * - Composition is generally used when you want the features of an existing
 * class inside your new class, but not its interface. That is, you embed an
 * object so that you can use it to implement features in your new class, but
 * the user of your new class sees the interface you’ve defined for the new
 * class rather than the interface from the embedded object. For this effect,
 * you embed private objects of existing classes inside your new class.
 * 
 * - Sometimes it makes sense to allow the class user to directly access the
 * composition of your new class; that is, to make the member objects public.
 * The member objects use implementation hiding themselves, so this is a safe
 * thing to do. When the user knows you’re assembling a bunch of parts, it makes
 * the interface easier to understand. A car object is a good example above.
 * 
 * - When you inherit, you take an existing class and make a special version of
 * it. In general, this means that you’re taking a general-purpose class and
 * specializing it for a particular need. With a little thought, you’ll see that
 * it would make no sense to compose a car using a vehicle object—a car doesn’t
 * contain a vehicle, it is a vehicle.
 * 
 * - The is-a relationship is expressed with inheritance, and the has-a
 * relationship is expressed with composition.
 */
