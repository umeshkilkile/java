Initialization and class loading
	- The compiled code for each class exists in its own separate file. That file isn’t loaded until the code is needed. 
	  In general, you can say that “class code is loaded at the point of first use.” This is usually when the first object of that 
	  class is constructed, but loading also occurs when a static field or static method is accessed.
	- The point of first use is also where the static initialization takes place. All the static objects and the static code block 
	  will be initialized in textual order (that is, the order that you write them down in the class definition) at the point of 
	  loading. The statics, of course, are initialized only once.
	- The constructor is also a static method even though the static keyword is not explicit. So to be precise, a class is first 
	  loaded when any one of its static members is accessed.