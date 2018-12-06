package com_16.polymorphism;

public class FieldAccess_Demo {
	public static void main(String[] args) {
		Super sup = new Sub(); // Upcast
		System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
		Sub sub = new Sub();
		System.out.println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField()
				+ ", sub.getSuperField() = " + sub.getSuperField());
	}
}

/*
 * - However, only ordinary method calls can be polymorphic.
 * 
 * - When a Sub object is upcast to a Super reference, any field accesses are
 * resolved by the compiler, and are thus not polymorphic. In this example,
 * different storage is allocated for Super.field and Sub.field. Thus, Sub
 * actually contains two fields called field: its own and the one that it gets
 * from Super. However, the Super version is not the default that is produced
 * when you refer to field in Sub; in order to get the Super field you must
 * explicitly say super.field.
 * 
 * - Although this seems like it could be a confusing issue, in practice it
 * virtually never comes up. For one thing, you’ll generally make all fields
 * private and so you won’t access them directly, but only as side effects of
 * calling methods. In addition, you probably won’t give the same name to a
 * base-class field and a derived-class field, because its confusing.
 */