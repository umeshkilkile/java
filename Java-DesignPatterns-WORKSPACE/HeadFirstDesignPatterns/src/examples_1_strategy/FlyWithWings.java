package examples_1_strategy;

/*
 * Flying behavior implementation for ducks that fly...
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}

}
