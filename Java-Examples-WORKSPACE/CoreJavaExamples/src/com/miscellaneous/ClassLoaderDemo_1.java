package com.miscellaneous;

public class ClassLoaderDemo_1 {
	public static void main(String[] args) {
		/*
		 * String class is loaded by bootstrap loader, and bootstrap loader is
		 * not Java object, hence null
		 */
		System.out.println(String.class.getClassLoader());

		/*
		 * ClassLoaderDemo_2 class is loaded by Application loader
		 */
		System.out.println(ClassLoaderDemo_1.class.getClassLoader());
	}
}
/*
 * These steps together describe the whole JVM.
 * 
 * - Loading
 * 
 * - Linking
 * 
 * - Initialization
 * 
 * There are three class loaders :
 * 
 * - Bootstrap class loader : Every JVM implementation must have a bootstrap
 * class loader, capable of loading trusted classes. It loads core java API
 * classes present in JAVA_HOME/jre/lib directory. This path is popularly known
 * as bootstrap path. It is implemented in native languages like C, C++.
 * 
 * - Extension class loader : It is child of bootstrap class loader. It loads
 * the classes present in the extensions directories
 * JAVA_HOME/jre/lib/ext(Extension path) or any other directory specified by the
 * java.ext.dirs system property. It is implemented in java by the
 * sun.misc.Launcher$ExtClassLoader class.
 * 
 * - System/Application class loader : It is child of extension class loader. It
 * is responsible to load classes from application class path. It internally
 * uses Environment Variable which mapped to java.class.path. It is also
 * implemented in Java by the sun.misc.Launcher$AppClassLoader class.
 * 
 * Note : JVM follow Delegation-Hierarchy principle to load classes. System
 * class loader delegate load request to extension class loader and extension
 * class loader delegate request to boot-strap class loader. If class found in
 * boot-strap path, class is loaded otherwise request again transfers to
 * extension class loader and then to system class loader. At last if system
 * class loader fails to load class, then we get run-time exception
 * java.lang.ClassNotFoundException.
 * 
 * 
 * Linking : Performs verification, preparation, and (optionally) resolution.
 * 
 * - Verification : It ensures the correctness of .class file i.e., it checks
 * whether this file is properly formatted and generated by valid compiler or
 * not. If verification fails, we get run-time exception java.lang.VerifyError.
 * 
 * 
 * - Preparation : JVM allocates memory for class variables and initializing the
 * memory to default values.
 * 
 * - Resolution : It is the process of replacing symbolic references from the
 * type with direct references. It is done by searching into method area to
 * locate the referenced entity.
 * 
 * 
 * Initialization : In this phase, all static variables are assigned with their
 * values defined in the code and static block(if any). This is executed from
 * top to bottom in a class and from parent to child in class hierarchy.
 * 
 * 
 * JVM Memory
 * 
 * - Method area :In method area, all class level information like class name,
 * immediate parent class name, methods and variables information etc. are
 * stored, including static variables. There is only one method area per JVM,
 * and it is a shared resource.
 * 
 * - Heap area :Information of all objects is stored in heap area. There is also
 * one Heap Area per JVM. It is also a shared resource.
 * 
 * - Stack area :For every thread, JVM create one run-time stack which is stored
 * here. Every block of this stack is called activation record/stack frame which
 * store methods calls. All local variables of that method are stored in their
 * corresponding frame. After a thread terminate, it�s run-time stack will be
 * destroyed by JVM. It is not a shared resource.
 * 
 * - PC Registers :Store address of current execution instruction of a thread.
 * Obviously each thread has separate PC Registers.
 * 
 * - Native method stacks :For every thread, separate native stack is created.
 * It stores native method information.
 * 
 * Execution Engine
 * 
 * - Execution engine execute the .class (bytecode). It reads the byte-code line
 * by line, use data and information present in various memory area and execute
 * instructions. It can be classified in three parts :-
 * 
 * - Interpreter : It interprets the bytecode line by line and then executes.
 * The disadvantage here is that when one method is called multiple times, every
 * time interpretation is required.
 * 
 * - Just-In-Time Compiler(JIT) : It is used to increase efficiency of
 * interpreter.It compiles the entire bytecode and changes it to native code so
 * whenever interpreter see repeated method calls, JIT provide direct native
 * code for that part so re-interpretation is not required,thus efficiency is
 * improved.
 * 
 * - Garbage Collector : It destroy un-referenced objects.
 * 
 * Java Native Interface (JNI) :
 * 
 * It is a interface which interacts with the Native Method Libraries and
 * provides the native libraries(C, C++) required for the execution. It enables
 * JVM to call C/C++ libraries and to be called by C/C++ libraries which may be
 * specific to hardware.
 * 
 * Native Method Libraries :
 * 
 * It is a collection of the Native Libraries(C, C++) which are required by the
 * Execution Engine.
 */