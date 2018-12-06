package Item2;

public class Demo_3 {
	public static void main(String[] args) {
		NutritionFacts_3 cocaCola = new NutritionFacts_3.Builder(240, 8).build();
		System.out.println("CocaCola : " + cocaCola);
		
		NutritionFacts_3 pepsi = new NutritionFacts_3.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
		System.out.println("Pepsi : " + pepsi);
	}
}
