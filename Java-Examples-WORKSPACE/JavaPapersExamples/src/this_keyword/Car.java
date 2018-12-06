package this_keyword;

public class Car {
	double price;
	String make;

	Car(double price, String make) {
		// Use 1 : To specifically denote that the instance variable is used
		// instead of static or local variable
		this.price = price;
		this.make = make;
	}

	// Use 2: Used to refer to constructors
	Car(String make) {
		this(100000.90, make);
	}

	Car() {
		this(1000.89, "Audi");
	}

	// Use 3: Can also be used to return the current instance
	public Car getCurrentInstance() {
		return this;
	}

	public Car copyCar(Car car) {
		return new Car(car.price, car.make);
	}

	@Override
	public String toString() {
		return "Make : " + make + " , Price : " + price + " $";
	}

	// Use 4: Java this can be used to get the handle of the current class
	public Class getClassDetails() {
		return this.getClass();
	}

}
