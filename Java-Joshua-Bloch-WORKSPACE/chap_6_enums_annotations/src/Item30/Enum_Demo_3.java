package Item30;

public class Enum_Demo_3 {
	public static void main(String[] args) {
		Operations operations = Operations.PLUS;
		
		double plus = operations.apply(10, 20);
		System.out.println(plus);
	}
}
