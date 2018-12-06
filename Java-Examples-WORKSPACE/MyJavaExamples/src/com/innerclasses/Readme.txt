Inner Classes
	- The inner class is a valuable feature because it allows you to group classes that logically belong together and to control the visibility of one within the other. However, it’s important to understand that inner classes are distinctly different from composition.
	- Inner classes can be created within a method or even an arbitrary scope. There are two reasons for doing this:
		1. You’re implementing an interface of some kind so that you can create and return a reference.
		2. You’re solving a complicated problem and you want to create a class to aid in your solution, but you don’t want it publicly available.
	
	- Anonymous inner classes cannot have constructors		