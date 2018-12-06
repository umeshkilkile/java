package com_9.classesandobjects;

/*
 * 
 * 1. A class contains constructors that are invoked to create objects from the
 * class blueprint. 
 * 
 * 2. Constructor declarations look like method
 * declarations—except that they use the name of the class and have no return
 * type.
 * 
 */
public class ConsructorInClass_DEMO_5 {

	int gear;
	int cadence;
	int speed;

	public ConsructorInClass_DEMO_5(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	/**
	 * 1. To create a new ConsructorInClass_5 object called myBike, a
	 * constructor is called by the new operator:
	 * 
	 * ConsructorInClass_5 myBike = new ConsructorInClass_5(30, 0, 8);
	 * 
	 * 2. new Bicycle(30, 0, 8) creates space in memory for the object and
	 * initializes its fields.
	 * 
	 * 3. The compiler automatically provides a no-argument, default constructor
	 * for any class without constructors. This default constructor will call
	 * the no-argument constructor of the superclass.
	 * 
	 * 4. Parameters refers to the list of variables in a method declaration.
	 * Arguments are the actual values that are passed in when the method is
	 * invoked. When you invoke a method, the arguments used must match the
	 * declaration's parameters in type and order.
	 * 
	 * 5. The phrase "instantiating a class" means the same thing as "creating
	 * an object." When you create an object, you are creating an "instance" of
	 * a class, therefore "instantiating" a class.
	 * 
	 * 6. If ConsructorInClass_DEMO_5(int,int,int) is your only constructor,
	 * then the compiler won’t let you create a ConsructorInClass_DEMO_5 object
	 * any other way.
	 */

}
