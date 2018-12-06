package examples_1_strategy_set_behavior_dynamically;

public abstract class Duck {

	/*
	 * Declare two reference variables for the behavior interface types.
	 */
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly(); // Delegate to behavior class
	}

	public void performQuack() {
		quackBehavior.quack();// Delegate to behavior class
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	/*
	 * Add two new methods for setting behavior dynamically
	 */

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
