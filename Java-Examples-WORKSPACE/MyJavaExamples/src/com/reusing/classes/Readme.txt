Reusing Classes
	- Two ways to accomplish this.
		1. Composition
			The first is quite straightforward: you simply create objects of your existing class inside the new class. 
			This is called composition, because the new class is composed of objects of existing classes. 
			You’re simply reusing the functionality of the code, not its form.
		2. Inheritance
			The second approach is more subtle. It creates a new class as a type of an existing class. 
			You literally take the form of the existing class and add code to it without modifying the existing class. 
			This technique is called inheritance, and the compiler does most of the work. 
			Inheritance is one of the cornerstones of object-oriented programming
			
Delegation
	- A third relationship, which is not directly supported by Java, is called delegation. 
	This is midway between inheritance and composition, because you place a member object in the class you’re building (like composition), 
	but at the same time you expose all the methods from the member object in your new class (like inheritance).			 

- The most important aspect of inheritance is not that it provides methods for the new class. 
	It’s the relationship expressed between the new class and the base class. 
	This relationship can be summarized by saying, “The new class is a type of the existing class.”	