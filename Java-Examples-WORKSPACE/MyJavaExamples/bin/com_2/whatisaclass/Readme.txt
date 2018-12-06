The Java interpreter
	- The Java interpreter proceeds as follows. First, it finds the environment variable CLASSPATH3 
	(set via the operating system, and sometimes by the installation program that installs Java or a Java-based tool 
	on your machine). CLASSPATH contains one or more directories that are used as roots in a search for .class files. 
	Starting at that root, the interpreter will take the package name and replace each dot with a slash to generate a 
	path name off of the CLASSPATH root (so package foo.bar.baz becomes foo\bar\baz or foo/bar/baz or possibly something else, 
	depending on your operating system). This is then concatenated to the various entries in the CLASSPATH. 
	That’s where it looks for the .class file with the name corresponding to the class you’re trying to create. 
	(It also searches some standard directories relative to where the Java interpreter resides.)