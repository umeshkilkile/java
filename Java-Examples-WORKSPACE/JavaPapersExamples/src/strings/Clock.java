package strings;

public class Clock {
	private final long startTime;

	public Clock() {
		startTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return System.currentTimeMillis() - startTime;
	}

}
