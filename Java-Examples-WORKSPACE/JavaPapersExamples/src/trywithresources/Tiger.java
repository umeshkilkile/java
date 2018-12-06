package trywithresources;

public class Tiger implements AutoCloseable {
	public Tiger() {
		System.out.println("TIGER is OPEN in the wild.");
	};

	public void hunt() throws Exception {
		throw new Exception("DeerNotFound says Tiger!");
	}

	public void close() throws Exception {
		System.out.println("TIGER is CLOSED in the cage.");
	}

}
