package examples_1_strategy_set_behavior_dynamically;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}
}
