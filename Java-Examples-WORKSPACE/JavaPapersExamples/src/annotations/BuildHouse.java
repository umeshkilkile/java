package annotations;

public class BuildHouse {
	@Developer("Umesh S Kilkile")
	public void aliceMethod() {
		System.out.println("This method is written by Alice");
	}

	@Developer("Popeye")
	public void buildHouse() {
		System.out.println("This method is written by Popeye");
	}

}
