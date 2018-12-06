package Item41;

/*
 * Selection among overloaded methods is static, while selection among overridden methods is dynamic
 */
public class OverridingDemo_1 {
	public static void main(String[] args) {
		Wine[] wines = { new Wine(), new SparklingWine(), new Champagne() };
		for (Wine wine : wines)
			System.out.println(wine.name());
	}
}