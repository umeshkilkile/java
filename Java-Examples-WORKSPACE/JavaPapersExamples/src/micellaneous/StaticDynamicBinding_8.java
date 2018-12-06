package micellaneous;

public class StaticDynamicBinding_8 {
	public static void main(String args[]) {

		/**
		 * Note : Whether to call the obey method of DomesticAnimal or Animal is
		 * resolved at runtime and so it is dynamic binding (late binding) as
		 * references are resolved at runtime.
		 */
		Animal animal = new DomesticAnimal();
		System.out.println(animal.obey());

		/**
		 * Note : Whether the method obey() or obey(String i) should be called
		 * is decided at compile time and so this is static binding (early
		 * binding) as references are resolved at compile time.
		 */
		DomesticAnimal domesticAnimal = new DomesticAnimal();
		System.out.println(domesticAnimal.obey("Ok!"));
	}
}

class Animal {
	public String obey() {
		return "No!";
	}
}

class DomesticAnimal extends Animal {
	@Override
	public String obey() {
		return "Yes!";
	}

	public String obey(String i) {
		return i;
	}
}
