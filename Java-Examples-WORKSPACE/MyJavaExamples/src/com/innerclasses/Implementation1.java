package com.innerclasses;

class Implementation1 implements Service {
	private Implementation1() {
	}

	@Override
	public void method1() {
		System.out.println("Implementation1 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation1 method2");
	}

	public static ServiceFactory factory = new ServiceFactory() {
		@Override
		public Service getService() {
			return new Implementation1();
		}
	};
}
/*
 * Now the constructors for Implementation1 and Implementation2 can be private,
 * and there�s no need to create a named class as the factory. In addition, you
 * often only need a single factory object, and so here it has been created as a
 * static field in the Service implementation.
 */