package examples_1_strategy_set_behavior_dynamically;

public class MiniDuckSimulator_Demo {
	public static void main(String[] args) {

		// Demo-1
		System.out.println("Mallard Duck");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		// Demo-2
		System.out.println("\nModel Duck");
		Duck model = new ModelDuck();
		model.performFly(); // The first call to performFly() delegates to the
							// flyBehavior object set in the ModleDuck's
							// constructor, which is a FlyNoWay instance
		model.setFlyBehavior(new FlyRocketPowered()); // To change a duck's behavior at runtime, just call the duck'e setter method for that behavior
		model.performFly();
	}
}
