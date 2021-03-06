package com_9.classesandobjects;

/*
 * Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the same time. 
 * They are like local classes except that they do not have a name.
 */
public class AnonymousClasses_DEMO_19 {

	interface HelloWorld {
		public void greet();

		public void greetSomeone(String someone);
	}

	public void sayHello() {

		class EnglishGreeting implements HelloWorld {
			String name = "world";

			public void greet() {
				greetSomeone("world");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		HelloWorld englishGreeting = new EnglishGreeting();

		/*
		 * The syntax of an anonymous class expression is like the invocation of
		 * a constructor, except that there is a class definition contained in a
		 * block of code.
		 */
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";

			public void greet() {
				greetSomeone("tout le monde");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		HelloWorld spanishGreeting = new HelloWorld() {
			String name = "mundo";

			public void greet() {
				greetSomeone("mundo");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
			}
		};
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
	}

	public static void main(String... args) {
		AnonymousClasses_DEMO_19 myApp = new AnonymousClasses_DEMO_19();
		myApp.sayHello();
	}
}
