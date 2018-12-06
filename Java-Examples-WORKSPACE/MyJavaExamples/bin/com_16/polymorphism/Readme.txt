Polymorphism
	- Polymorphism is the third essential feature of an object-oriented programming language, after data abstraction and inheritance.
	- It provides another dimension of separation of interface from implementation, to decouple what from how. 
	- Polymorphism allows improved code organization and readability as well as the creation of extensible programs that can be “grown” 
	  not only during the original creation of the project, but also when new features are desired.
	- Encapsulation creates new data types by combining characteristics and behaviors. Implementation hiding separates the interface from the implementation by making the details private. This sort of mechanical organization makes ready sense to someone with a procedural programming background. But polymorphism deals with decoupling in terms of types.
	- Polymorphism also called dynamic binding or late binding or run-time binding
	- Polymorphism means “different forms.” In object-oriented programming, you have the same interface from the base class, and different forms using that interface: the different versions of the dynamically bound methods.

Method-call binding
	- Connecting a method call to a method body is called binding.
	- When binding is performed before the program is run (by the compiler and linker, if there is one), it’s called early binding.
	- Late binding, which means that the binding occurs at run time, based on the type of object. Late binding is also called dynamic binding or runtime binding.

Constructors and polymorphism
	- As usual, constructors are different from other kinds of methods. This is also true when polymorphism is involved. 
	  Even though constructors are not polymorphic (they’re actually static methods, but the static declaration is implicit)
	- A constructor for the base class is always called during the construction process for a derived class, chaining up the inheritance hierarchy 
		so that a constructor for every base class is called. This makes sense because the constructor has a special job: to see that the object is built properly. 
		A derived class has access to its own members only, and not to those of the base class (whose members are typically private). 
		Only the base-class constructor has the proper knowledge and access to initialize its own elements. 
		Therefore, it’s essential that all constructors get called; otherwise the entire object wouldn’t be constructed. 
		That’s why the compiler enforces a constructor call for every portion of a derived class. It will silently call the default constructor if you don’t explicitly call a base-class constructor in the derived-class constructor body. 
		If there is no default constructor, the compiler will complain. (In the case where a class has no constructors, the compiler will automatically synthesize a default constructor.)
		
		