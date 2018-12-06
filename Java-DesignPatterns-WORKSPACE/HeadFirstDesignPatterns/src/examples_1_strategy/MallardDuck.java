package examples_1_strategy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		/*
		 * The MallardDuck uses the Quack class to handle its quack, so when
		 * performQuack is called, the responsibility for the quack is delegated
		 * to the Quack object.
		 */
		quackBehavior = new Quack();

		/*
		 * And it uses FlyWithWings as its FlyBehavior type.
		 */
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck");
	}
}
