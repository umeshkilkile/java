package examples_1_strategy_set_behavior_dynamically;

/*
 * Mute behavior implementation for ducks that do not quack...
 */

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
