package com.reusing.classes;

//Wind objects are instruments because they have the same interface:
public class Wind_Demo extends Instrument {
	public static void main(String[] args) {
		Wind_Demo flute = new Wind_Demo();
		Instrument.tune(flute); // Upcasting
	}
}

/*
 * What�s interesting in this example is the tune( ) method, which accepts an
 * Instrument reference. However, in Wind.main( ) the tune( ) method is called
 * by giving it a Wind reference. Given that Java is particular about type
 * checking, it seems strange that a method that accepts one type will readily
 * accept another type, until you realize that a Wind object is also an
 * Instrument object, and there�s no method that tune( ) could call for an
 * Instrument that isn�t also in Wind. Inside tune( ), the code works for
 * Instrument and anything derived from Instrument, and the act of converting a
 * Wind reference into an Instrument reference is called upcasting.
 * 
 * Why �upcasting�?
 * 
 * - Upcasting is always safe because you�re going from a more specific type to
 * a more general type. That is, the derived class is a superset of the base
 * class. It might contain more methods than the base class, but it must contain
 * at least the methods in the base class. The only thing that can occur to the
 * class interface during the upcast is that it can lose methods, not gain them.
 * This is why the compiler allows upcasting without any explicit casts or other
 * special notation.
 * 
 * When to use inheritance and composition?
 * 
 * - One of the clearest ways to determine whether you should use composition or
 * inheritance is to ask whether you�ll ever need to upcast from your new class
 * to the base class. If you must upcast, then inheritance is necessary, but if
 * you don�t need to upcast, then you should look closely at whether you need
 * inheritance.
 */