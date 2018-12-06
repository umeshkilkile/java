package inheritance;

public class Demo_1 {
	public static void main(String[] args) {
		Add add = new Add();
		System.out.println(add.get());

		Add2 add2 = new Add2();
		System.out.println(add2.get());

		Add add22 = new Add2();
		System.out.println(add22.get());
	}
}
