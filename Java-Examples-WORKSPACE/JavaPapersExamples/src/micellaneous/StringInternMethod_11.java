package micellaneous;

/**
 * NOTE 1: intern() Returns a canonical representation for the string object. A
 * pool of strings, initially empty, is maintained privately by the class String
 * When the intern method is invoked, if the pool already contains a string
 * equal to this String object as determined by the method, then the string from
 * the pool is returned. Otherwise, this String object is added to the pool and
 * a reference to this String object is returned. It follows that for any two
 * strings s and t, s.intern() == t.intern() is true if and only if s.equals(t)
 * is true.
 * 
 */
public class StringInternMethod_11 {
	public static void main(String[] args) {
		String s1 = "Umesh";
		String s2 = "Umesh";
		String s3 = "Umesh".intern();
		String s4 = new String("Umesh");
		String s5 = new String("Umesh").intern();

		if (s1 == s2) {
			System.out.println("s1 and s2 are same : s1-hashcode-> " + s1.hashCode() + " : s2-hashcode-> " + s2.hashCode()); // 1.
		}

		if (s1 == s3) {
			System.out.println("s1 and s3 are same : s1-hashcode-> " + s1.hashCode() + " : s3-hashcode-> " + s3.hashCode()); // 2.
		}

		if (s1 == s4) {
			System.out.println("s1 and s4 are same : s1-hashcode-> " + s1.hashCode() + " : s4-hashcode-> " + s4.hashCode()); // 3.
		} else {
			System.out.println("s1 and s4 are not same : s1-hashcode-> " + s1.hashCode() + " : s4-hashcode-> " + s4.hashCode()); // 3.
		}

		if (s1 == s5) {
			System.out.println("s1 and s5 are same : s1-hashcode-> " + s1.hashCode() + " : s5-hashcode-> " + s5.hashCode()); // 4.
		}
	}
}
