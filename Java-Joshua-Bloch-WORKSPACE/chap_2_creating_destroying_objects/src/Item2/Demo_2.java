package Item2;

/*
 * This pattern (JavaBeans pattern) has none of the disadvantages of the telescoping constructor pattern.
It is easy, if a bit wordy, to create instances, and easy to read the resulting code:
 */
public class Demo_2 {
	public static void main(String[] args) {
		NutritionFacts_2 cocaCola = new NutritionFacts_2();

		cocaCola.setServingSize(240);
		cocaCola.setServings(8);
		cocaCola.setCalories(100);
		cocaCola.setSodium(35);
		cocaCola.setCarbohydrate(27);

		System.out.println("CocaCola : " + cocaCola);

		NutritionFacts_2 pepsi = new NutritionFacts_2();

		pepsi.setServingSize(240);
		pepsi.setServings(8);

		System.out.println("Pepsi : " + pepsi);
	}
}
