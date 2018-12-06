package Item2;

/**
 * 
 * @author kilkile
 *
 *         Item 2: Consider a builder when faced with many constructor
 *         parameters
 */

// Telescoping constructor pattern - does not scale well!
public class NutritionFacts {

	private final int servingSize; // (mL) required
	private final int servings; // (per container) required
	private final int calories; // optional
	private final int fat; // (g) optional
	private final int sodium; // (mg) optional
	private final int carbohydrate; // (g) optional

	public NutritionFacts(int servingSize, int servings) {
		this(servingSize, servings, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("servingSize : " + servingSize);
		sb.append(", servings : " + servings);
		sb.append(", calories : " + calories);
		sb.append(", fat : " + fat);
		sb.append(", sodium : " + sodium);
		sb.append(", carbohydrate : " + carbohydrate);

		return sb.toString();
	}
}

/*
 * NOTE: The telescoping constructor pattern works, but it is hard to write
 * client code when there are many parameters, and harder still to read it.
 */
