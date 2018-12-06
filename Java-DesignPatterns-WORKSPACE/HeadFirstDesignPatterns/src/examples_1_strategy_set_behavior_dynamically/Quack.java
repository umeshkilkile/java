package examples_1_strategy_set_behavior_dynamically;

/*
 * Quack behavior implementation for ducks that quack...
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
