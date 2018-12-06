import java.util.concurrent.TimeUnit;

public class TimeDifference {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++){
			System.out.println("1");
		}
		long end = System.currentTimeMillis();
		System.out.println("TimeDifference.main()" + convertMilliToSeconds(end - start));
	}

	public static String convertMilliToSeconds(long milliseconds) {
		return String.format("%02d min, %02d sec", TimeUnit.MILLISECONDS.toMinutes(milliseconds),
				TimeUnit.MILLISECONDS.toSeconds(milliseconds)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds)));
	}
}
