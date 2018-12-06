package com.designpatterns.creational.singleton_1;

import java.io.ObjectStreamException;
import java.io.Serializable;


/**
 *  Make the singleton class final to avoid sub classing 
 */
public final class Singleton_4 implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static transient Singleton_4 INSTANCE;

	/**
	 * Step 1: Provide a default Private constructor. Prevents instantiation
	 */
	private Singleton_4() {
	}

	/**
	 * Step 2: Create a Method for getting the reference to the Singleton Object
	 * 
	 * Step 3: Make the Access method Synchronized to prevent Thread Problems.
	 */
	public static synchronized Singleton_4 getInstance() {
		
		if (INSTANCE == null) {
			
			synchronized(Singleton_4.class){
				//Doouble check here
				if(INSTANCE == null){
					INSTANCE = new Singleton_4();
				}
			}
		}
		return INSTANCE;
	}

	/**
	 * Step 4: Override the Object clone method to prevent cloning
	 */
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	/**
	 * readResolve method to preserve singleton property
	 */
	private Object readResolve() throws ObjectStreamException {
		return INSTANCE;
	}
	
	
}
