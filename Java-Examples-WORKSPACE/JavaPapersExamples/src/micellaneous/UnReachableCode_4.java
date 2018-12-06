package micellaneous;

public class UnReachableCode_4 {
	public static void main(String[] args) {
		System.out.println(returnInt());
	}
	
	public static int returnInt(){
		return 100;
		
		return 200; //Unreachable code
	}
}

