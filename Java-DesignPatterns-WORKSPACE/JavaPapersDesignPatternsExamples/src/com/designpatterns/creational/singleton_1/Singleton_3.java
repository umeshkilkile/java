package com.designpatterns.creational.singleton_1;

import java.io.Serializable;

public class Singleton_3 implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
 
    private Singleton_3() {
        // private constructor
    }
 
    private static class Singleton_3_Holder {
        public static final Singleton_3 INSTANCE = new Singleton_3();
    }
 
    public static Singleton_3 getInstance() {
        return Singleton_3_Holder.INSTANCE;
    }
 
    protected Object readResolve() {
        return getInstance();
    }
    
    protected Object clone() throws CloneNotSupportedException{
		return null;
    }
}
