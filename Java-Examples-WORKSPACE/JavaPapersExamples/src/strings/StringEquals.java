package strings;

/**
 * Hashing is used to index and retrieve items in a database because it is
 * faster to find the item using the shorter hashed key than to find it using
 * the original value.
 */
public class StringEquals {
	public static void main(String[] args) {
		String s = "Umesh";
		String s1 = "Umesh";

		if (s == s1) {
			System.out.println("s == s1 is TRUE");
		} else {
			System.out.println("s == s1 is FALSE");
		}

		if (s.equals(s1)) {
			System.out.println("s.equals(s1) is TRUE");
		} else {
			System.out.println("s.equals(s1) is FALSE");
		}

		System.out.println("s hashcode : " + s.hashCode());
		System.out.println("s1 hashcode : " + s1.hashCode());

		String s2 = new String("Umesh");
		String s3 = new String("Umesh");

		if (s2 == s3) {
			System.out.println("s2 == s3 is TRUE");
		} else {
			System.out.println("s2 == s3 is FALSE");
		}

		if (s2.equals(s3)) {
			System.out.println("s2.equals(s3) is TRUE");
		} else {
			System.out.println("s2.equals(s3) is FALSE");
		}
		System.out.println("s2 hashcode : " + s2.hashCode());
		System.out.println("s3 hashcode : " + s3.hashCode());
		
		
		if (s1 == s3) {
			System.out.println("s1 == s3 is TRUE");
		} else {
			System.out.println("s1 == s3 is FALSE");
		}

		if (s1.equals(s3)) {
			System.out.println("s1.equals(s3) is TRUE");
		} else {
			System.out.println("s1.equals(s3) is FALSE");
		}
	}
}
