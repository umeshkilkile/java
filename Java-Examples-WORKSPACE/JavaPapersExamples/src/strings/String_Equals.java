package strings;

public class String_Equals {
	 public static void main(String[] args) {
		String str1 = "Umesh";
		String str2 = "Umesh";
		
		System.out.println("str1 == str2 -> " + (str1 == str2));
		System.out.println("str1.equals(str2) -> " + (str1.equals(str2)));

		String str3 = new String("Umesh");
		System.out.println("str3 == str2 -> " + (str3 == str2));
		System.out.println("str3.equals(str2) -> " + (str3.equals(str2)));
		
		String str4 = new String("Umesh");
		System.out.println("str4 == str3 -> " + (str4 == str3));
		System.out.println("str4.equals(str4) -> " + (str4.equals(str4)));
	}
}
