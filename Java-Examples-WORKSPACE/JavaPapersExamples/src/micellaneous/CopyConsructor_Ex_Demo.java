package micellaneous;

public class CopyConsructor_Ex_Demo {
	public static void main(String[] args) {
		
		CopyConstructor_Ex copyConstructor_Ex = new CopyConstructor_Ex("Umesh",	"Kilkile");
		System.out.println(copyConstructor_Ex);

		CopyConstructor_Ex copyConstructor_Ex2 = new CopyConstructor_Ex(copyConstructor_Ex);
		System.out.println(copyConstructor_Ex2);
	}
}
