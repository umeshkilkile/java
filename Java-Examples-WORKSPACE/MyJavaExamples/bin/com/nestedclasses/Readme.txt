Nested Classes
	- If you don’t need a connection between the inner-class object and the outerclass object, then you can make the inner class static. This is commonly called a nested class.
	- To understand the meaning of static when applied to inner classes, you must remember that the object of an ordinary inner class implicitly keeps a reference to the object of the enclosing class that created it. This is not true, however, when you say an inner class is static.
	
	A nested class means:
		1. You don’t need an outer-class object in order to create an object of a nested class.
		2. You can’t access a non-static outer-class object from an object of a nested class.
		
	- Nested classes are different from ordinary inner classes in another way, as well. Fields and methods in ordinary inner classes can only be at the outer level of a class, so ordinary inner classes cannot have static data, static fields, or nested classes. However, nested classes can have all of these:
	
- Inner-class identifiers
	Since every class produces a .class file that holds all the information about how to create objects of this type (this information produces a "meta-class" called the Class object), you might guess that inner classes must also produce .class files to contain the information for their Class objects. The names of these files/classes have a strict formula: the name of the enclosing class, followed by a ‘$’, followed by the name of the inner class. For example, the .class files created by LocalInnerClass.java include:
		Counter.class
		LocalInnerClass$l.class
		LocallnnerClassSlLocalCounter.class
		LocallnnerClass.class
	If inner classes are anonymous, the compiler simply starts generating numbers as inner-class identifiers. If inner classes are nested within inner classes, their names are simply appended after a ‘$’ and the outer-class identifier (s).
	
	Although this scheme of generating internal names is simple and straightforward, it’s also robust and handles most situations.5 Since it is the standard naming scheme for Java, the generated files are automatically platform-independent. (Note that the Java compiler is changing your inner classes in all sorts of other ways in order to make them work.)	 