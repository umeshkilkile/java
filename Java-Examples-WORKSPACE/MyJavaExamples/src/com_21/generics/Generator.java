package com_21.generics;

public interface Generator<T> {
	T next();
}
/*
 * -Generics also work with interfaces. Generics also work with interfaces. For
 * example, a generator is a class that creates objects. It�s actually a
 * specialization of the Factory Method design pattern, but when you ask a
 * generator for new object, you don�t pass it any arguments, whereas you
 * typically do pass arguments to a Factory Method. The generator knows how to
 * create new objects without any extra information.
 * 
 * - The return type of next( ) is parameterized to T. As you can see, using
 * generics with interfaces is no different than using generics with classes.
 */