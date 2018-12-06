package interfaces_and_abstractclasses;

public abstract class AbstractCar implements Car{

	//Abstract class may or may not provide implementations for methods of interfaces
	
/*	@Override
	public int getGear() {
		// TODO Auto-generated method stub
		return 0;
	}
*/	
	
	@Override
	public String name() {
		return "Ford Ikon";
	}
}
