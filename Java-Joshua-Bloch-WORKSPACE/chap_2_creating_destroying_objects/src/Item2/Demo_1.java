package Item2;

public class Demo_1 {
	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
		System.out.println("Coca Cola : " + cocaCola);

		NutritionFacts pepsi = new NutritionFacts(240, 8);
		System.out.println("Pepsi : " + pepsi);
	}
}
