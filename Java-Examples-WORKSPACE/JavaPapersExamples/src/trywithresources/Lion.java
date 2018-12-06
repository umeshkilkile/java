package trywithresources;

public class Lion implements AutoCloseable {
	public Lion() {
		System.out.println("LION is OPEN in the wild.");
	}

	public void hunt() throws Exception {
		System.out.println("Inside Lion.hunt()");
		throw new Exception("DeerNotFound says Lion!");
	}

	public void close() throws Exception {
		System.out.println("LION is CLOSED in the cage.");
		throw new Exception("Unable to close the cage!");
	}

}
