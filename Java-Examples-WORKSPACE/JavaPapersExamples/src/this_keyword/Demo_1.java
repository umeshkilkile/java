package this_keyword;

public class Demo_1 {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car);

		Car mercedes = new Car("Mercedes");
		System.out.println(mercedes);

		Car bmw = new Car(9999, "BMW");
		System.out.println(bmw);
		System.out.println("Current Instance : " + bmw.getCurrentInstance());
		
		Car copiedCar = bmw.copyCar(mercedes);
		System.out.println("Copied car : " + copiedCar);
		
		System.out.println(copiedCar.getClassDetails().getName());
		
	}
}
