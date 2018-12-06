package examples_1_strategy_set_behavior_dynamically;

/*
 * Squeak behavior implementation for ducks that squeak...
 */

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");

	}

}
