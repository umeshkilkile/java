package Item2;

/**
 * The Builder pattern is a good choice when designing classes whose
 * constructors or static factories would have more than a handful of
 * parameters, especially if most of those parameters are optional. Client code
 * is much easier to read and write with builders than with the traditional
 * telescoping constructor pattern, and builders are much safer than JavaBeans.
 * 
 * e.g., StringBuilder is based on builder design pattern.
 * 
 * @author kilkile
 *
 */
// Builder Pattern
public class NutritionFacts_3 {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Builder {
		// Required parameters
		private final int servingSize;
		private final int servings;
		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public NutritionFacts_3 build() {
			return new NutritionFacts_3(this);
		}
	}

	private NutritionFacts_3(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
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
 * Luckily, there is a third alternative that combines the safety of the
 * telescoping constructor pattern with the readability of the JavaBeans
 * pattern. It is a form of the Builder pattern.
 * 
 * The NutritionFacts class is immutable, and all parameter default values are
 * in one place. The builder’s setter methods return the builder itself so that
 * invocations can be chained, resulting in a fluent API.
 */