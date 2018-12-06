package Item11CHECK;

public class PhoneNumber_Demo_1 {
	public static void main(String[] args) {

		PhoneNumber_1 phoneNumber = new PhoneNumber_1(707, 867, 5309);
		System.out.println("Failed to connect : " + phoneNumber);

		PhoneNumber_1 clonedObj = phoneNumber.clone();

		System.out.println("From cloned : " + clonedObj.toString());
		System.out.println(clonedObj.getAreaCode());
		System.out.println(clonedObj.getPrefix());
		System.out.println(clonedObj.getLineNumber());
	}
}
