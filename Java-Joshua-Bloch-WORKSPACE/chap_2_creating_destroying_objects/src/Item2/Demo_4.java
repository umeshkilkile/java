package Item2;

import Item2.NyPizza.Size;
import Item2.Pizza.Topping;

/*
 * The Builder pattern is well suited to class hierarchies. Use a parallel
hierarchy of builders, each nested in the corresponding class. Abstract classes
have abstract builders; concrete classes have concrete builders.
 */
public class Demo_4 {
	public static void main(String[] args) {
		NyPizza pizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
		System.out.println("pizza = " + pizza);

		Calzone calzone = new Calzone.Builder().addTopping(Topping.HAM).sauceInside().build();
		System.out.println("calzone = " + calzone);
	}
}
