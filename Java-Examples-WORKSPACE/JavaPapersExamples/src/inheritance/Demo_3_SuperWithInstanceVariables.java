package inheritance;

public class Demo_3_SuperWithInstanceVariables {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.i);
		
		B b = new B(10,20);
		System.out.println(b.i);
		b.show();
		
		b.assignValues(100, 200);
		System.out.println(b.i);
		b.show();
	}
}
