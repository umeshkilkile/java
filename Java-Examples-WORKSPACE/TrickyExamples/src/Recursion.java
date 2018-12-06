
public class Recursion {
	public static void main(String[] args) {
		System.out.println(recursion(6));
	}

	public static int recursion(int k) {
		int result;
		if (k > 0) {
			result = k + recursion(k - 1);
			System.out.println(result);
		} else {
			result = 0;
		}
		return result;
	}
}
