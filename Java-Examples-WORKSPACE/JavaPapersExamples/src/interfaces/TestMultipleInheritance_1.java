package interfaces;

public class TestMultipleInheritance_1 implements Add, Sum {

	/**
	 * Acceptance Test Case 1 : Here even if two interfaces are going to have same method,
	 * the implementing class will have only one method and that too will be
	 * done by the implementer.
	 */
	// The below int sum(int num1, int num2); method is present in both Add and
	// Sum interfaces. Hence only one method is added here.
	@Override
	public int sum(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	// The below float sum(float num1, float num2); method is present in only
	// Add interface. Hence only one method is added here.
	@Override
	public float sum(float num1, float num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}
}
