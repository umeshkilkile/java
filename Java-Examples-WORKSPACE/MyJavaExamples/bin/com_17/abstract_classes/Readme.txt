Abstract Class
	- abstract method this is a method that is incomplete; it has only a declaration and no method body.
	- A class containing abstract methods is called an abstract class.
	- If a class contains one or more abstract methods, the class itself must be qualified as abstract. 
		(Otherwise, the compiler gives you an error message.)
	- If you inherit from an abstract class and you want to make objects of the new type, you must provide method definitions 
		for all the abstract methods in the base class. If you don’t (and you may choose not to), then the derived class is also 
		abstract, and the compiler will force you to qualify that class with the abstract keyword.
	- It’s possible to make a class abstract without including any abstract methods. This is useful when you’ve got a class in 
		which it doesn’t make sense to have any abstract methods, and yet you want to prevent any instances of that class.
	- Since making a class abstract doesn’t force you to make all the methods abstract.	