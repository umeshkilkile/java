package inheritance;

public class B extends A {
	int i;

	B(int x, int y) {
		i = x;
		super.i = y;
	}
	
	void assignValues(int x, int y){
		i = x;
		super.i = y;
	}
	
	int sum(){
		return i + super.i;
	}
	
	void show(){
		System.out.println("i in A : " + super.i);
		System.out.println("i in B : " + i);
	}
}
