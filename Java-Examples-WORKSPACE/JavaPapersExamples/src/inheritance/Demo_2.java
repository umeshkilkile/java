package inheritance;

public class Demo_2 {
	public static void main(String[] args) {
		Audi audi = new Audi();
		
		audi.i = 10;
		audi.j = 20;
		
		audi.showij();

		BMW bmw = new BMW();
		bmw.i = 100;
		bmw.j = 200;
		bmw.k = 300;
		
		bmw.showij();
		bmw.showk();
		bmw.sum();
	}
}
