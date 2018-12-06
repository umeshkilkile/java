package Item2;

/**
 * 
 * @author kilkile
 * 
 *         - Disadvantage 1 : A JavaBean may be in an inconsistent state partway
 *         through its construction.
 * 
 *         - Disadvantage 2 : The JavaBeans pattern precludes the possibility of
 *         making a class immutable, and requires added effort on the part of
 *         the programmer to ensure thread safety.
 */
// JavaBeans Pattern - allows inconsistency, mandates mutability
public class NutritionFacts_2 {
	// Parameters initialized to default values (if any)
	private int servingSize = -1; // Required; no default value
	private int servings = -1; // " " " "
	private int calories = 0;
	private int fat = 0;
	private int sodium = 0;
	private int carbohydrate = 0;

	public NutritionFacts_2() {
	}

	// Setters
	public void setServingSize(int val) {
		servingSize = val;
	}

	public void setServings(int val) {
		servings = val;
	}

	public void setCalories(int val) {
		calories = val;
	}

	public void setFat(int val) {
		fat = val;
	}

	public void setSodium(int val) {
		sodium = val;
	}

	public void setCarbohydrate(int val) {
		carbohydrate = val;
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
 * A second alternative when you’re faced with many optional parameters in a
 * constructor is the JavaBeans pattern, in which you call a parameterless
 * constructor to create the object and then call setter methods to set each
 * required parameter and each optional parameter of interest:
 */