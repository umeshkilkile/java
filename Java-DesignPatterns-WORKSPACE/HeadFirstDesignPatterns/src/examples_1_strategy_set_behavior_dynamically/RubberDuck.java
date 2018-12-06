package examples_1_strategy_set_behavior_dynamically;

public class RubberDuck extends Duck {
	public RubberDuck() {

		quackBehavior = new MuteQuack();

		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Rubber Duck");
	}
}
