package examples_1_strategy;

public class MiniDuckSimulator_Demo {
	public static void main(String[] args) {

		// Demo-1
		System.out.println("Mallard Duck");
		Duck mallard = new MallardDuck();

		/*
		 * This calls the MallardDuck's inherited performQuack() method, which
		 * then delegates to object's QuackBehavior that is calls quack() on the
		 * duck's inherited quackBehavior reference
		 */
		mallard.performQuack();

		/*
		 * Then we do the same thing with MallardDuck's inherited performFly()
		 * method.
		 */
		mallard.performFly();

		// Demo-2
		System.out.println("\nRubber Duck");
		Duck rubber = new RubberDuck();
		rubber.performFly();
		rubber.performQuack();

	}
}
