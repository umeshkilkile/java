package examples_1_strategy;

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
}
