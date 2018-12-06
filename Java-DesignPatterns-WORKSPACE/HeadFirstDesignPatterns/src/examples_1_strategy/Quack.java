package examples_1_strategy;

/*
 * Quack behavior implementation for ducks that quack...
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
