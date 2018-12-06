package micellaneous;

public class EqualsAndHashCodeEx_7 {

	public static void main(String args[]) {
		Tiger bengalTiger1 = new Tiger("Yellow", "Dense", 3);
		Tiger bengalTiger2 = new Tiger("Yellow", "Dense", 3);
		Tiger siberianTiger = new Tiger("White", "Sparse", 4);
		
		System.out.println("bengalTiger1 and bengalTiger2 : " + bengalTiger1.equals(bengalTiger2));
		System.out.println("bengalTiger1 and siberianTiger : " + bengalTiger1.equals(siberianTiger));
		
		System.out.println("bengalTiger1 hashCode : " + bengalTiger1.hashCode());
		System.out.println("bengalTiger2 hashCode : " + bengalTiger2.hashCode());
		System.out.println("siberianTiger hashCode : " + siberianTiger.hashCode());
	}

}