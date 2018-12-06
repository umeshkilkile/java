package examples_1_strategy_set_behavior_dynamically;

/*
 * Flying behavior implementaiotn for ducks that do NOT fly
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
