Java access specifiers
	- The Java access specifiers public, protected, and private are placed in front of each definition for each member in your class, whether it’s a field or a method. Each access specifier only controls the access for that particular definition.
	- If you don’t provide an access specifier, it means “package access.”

	Package access
		- The default access has no keyword, but it is commonly referred to as package access
		- It means that all the other classes in the current package have access to that member, but to all the classes outside of this package, the member appears to be private.
		- Since a compilation unit—a file—can belong only to a single package, all the classes within a single compilation unit are automatically available to each other via package access.
	public
		- When you use the public keyword, it means that the member declaration that immediately follows public is available to everyone
	
	private
		- The private keyword means that no one can access that member except the class that contains that member, 
			inside methods of that class. Other classes in the same package cannot access private members, so it’s 
			as if you’re even insulating the class against yourself. On the other hand, it’s not unlikely that a package 
			might be created by several people collaborating together, so private allows you to freely change that member 
			without concern that it will affect another class in the same package.

- Access control is often referred to as implementation hiding. 
- Wrapping data and methods within classes in combination with implementation hiding is often called encapsulation. 
	The result is a data type with characteristics and behaviors.

- A class cannot be private (that would make it inaccessible to anyone but the class) or protected. So you have only two choices 
	for class access: package access or public. 
	If you don’t want anyone else to have access to that class, you can make all the constructors private, 
	thereby preventing anyone but you, inside a static member of the class, from creating an object of that class.