package com_9.classesandobjects;

public class StaticInstanceConstBlocks_DEMO_13 {
	{
		System.out.println("StaticInstanceConst_13.instance block-1");
	}

	static {
		System.out.println("StaticInstanceConst_13.static bolck-1");
	}

	{
		System.out.println("StaticInstanceConst_13.instance block-2");
	}
	static {
		System.out.println("StaticInstanceConst_13.static bolck-2");
	}

	StaticInstanceConstBlocks_DEMO_13() {
		System.out.println("StaticInstanceConst_13.StaticInstanceConst_13()");
	}

	public static void main(String[] args) {
		StaticInstanceConstBlocks_DEMO_13 const_13 = new StaticInstanceConstBlocks_DEMO_13();
		System.out.println("StaticInstanceConst_13.main()");
	}
}

/*
 * NOTES : A class can have any number of static initialization blocks, and they
 * can appear anywhere in the class body. The runtime system guarantees that
 * static initialization blocks are called in the order that they appear in the
 * source code.
 * 
 * Order of execution
 * 1. Static block
 * 2. instance block
 * 3. Constructor
 * 
 */
