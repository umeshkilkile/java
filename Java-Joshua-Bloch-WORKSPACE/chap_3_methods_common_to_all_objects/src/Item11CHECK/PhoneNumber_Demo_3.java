package Item11CHECK;

public class PhoneNumber_Demo_3 {
	public static void main(String[] args) {

		PhoneNumber_3 phoneNumber = new PhoneNumber_3(707, 867, 5309);
		System.out.println("Normal : " + phoneNumber + ", hashcode  :" + phoneNumber.hashCode());

		PhoneNumber_3 clonedPhoneNumber = new PhoneNumber_3(phoneNumber);
		System.out.println("Cloned using copy costructor : " + clonedPhoneNumber + " , hashcode : " + clonedPhoneNumber.hashCode());

		PhoneNumber_3 clonedPhoneNumber2 = PhoneNumber_3.newInstance(phoneNumber);
		System.out.println("Cloned using factory : " + clonedPhoneNumber2 + " , hashcode : " + clonedPhoneNumber2.hashCode());
	}
}
