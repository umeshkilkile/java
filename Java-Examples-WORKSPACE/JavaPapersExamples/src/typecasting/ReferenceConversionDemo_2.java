package typecasting;

public class ReferenceConversionDemo_2 {
	public static void main(String... args) {
		Integer integer = new Integer(10);
		Float floatt = new Float(20F);
		// this is not a cast - error
		//integer = floatt; //compiler error - incompatible types
		// integer = (Integer) floatt;//compiler error - inconvertible types
		
		// upcast - widening conversion
		Object obj = integer; // no explicit cast required
		System.out.println("obj : " + obj);
		
		// downcast - narrowing conversion
		Integer in = (Integer) obj;// only subtype
		System.out.println("in : " + in);

		// downcast - Object to String
		// runtime issue - instance Object is not of String
		String str = (String) obj;// ClassCastException
	}

}
