package examples_1_strategy_set_behavior_dynamically;

/*
 * Flying behavior implementation for ducks that fly...
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}

}
