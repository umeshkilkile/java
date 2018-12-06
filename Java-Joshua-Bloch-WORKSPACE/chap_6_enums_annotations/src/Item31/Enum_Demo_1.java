package Item31;

public class Enum_Demo_1 {
	public static void main(String[] args) {
		Ensemble ensemble = Ensemble.NONET;
		System.out.println(ensemble.ordinal());
		int i = ensemble.numberOfMusicians();
		System.out.println(i);
	}
}
