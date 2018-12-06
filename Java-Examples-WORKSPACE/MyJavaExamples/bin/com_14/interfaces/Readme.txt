Interfaces
	- Interfaces and abstract classes provide more structured way to separate interface from implementation.
	- The interface keyword takes the concept of abstractness one step further.
	- The abstract keyword allows you to create one or more undefined methods in a class — you provide part of the interface 
		without providing a corresponding implementation. The implementation is provided by inheritors.
	- The interface keyword produces a completely abstract class, one that provides no implementation at all. 
		It allows the creator to determine method names, argument lists, and return types, but no method bodies. 
		An interface provides only a form, but no implementation.
	- So the interface is used to establish a "protocol" between classes.
	- You can add the public keyword before the interface keyword (but only if that interface is defined in a file of the same name). 
		If you leave off the public keyword, you get package access, so the interface is only usable within the same package. 
		An interface can also contain fields, but these are implicitly static and final.
	- You can choose to explicitly declare the methods in an interface as public, but they are public even if you don’t say it.
	- So when you implement an interface, the methods from the interface must be defined as public. Otherwise, they would default to 
		package access, and you’d be reducing the accessibility of a method during inheritance, which is not allowed by the Java compiler.
	- Decoupling interface from implementation allows an interface to be applied to multiple different implementations, and thus your code is more reusable.
	- Because any fields you put into an interface are automatically static and final, the interface is a convenient tool for creating groups of constant values.
	- Fields defined in interfaces cannot be "blank finals," but they can be initialized with non-constant expressions.


