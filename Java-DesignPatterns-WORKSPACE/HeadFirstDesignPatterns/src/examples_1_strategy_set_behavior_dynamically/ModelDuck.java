package examples_1_strategy_set_behavior_dynamically;

public class ModelDuck extends Duck {

	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
