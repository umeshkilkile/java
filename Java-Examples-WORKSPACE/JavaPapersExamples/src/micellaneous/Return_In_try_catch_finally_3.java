package micellaneous;

public class Return_In_try_catch_finally_3 {
	public static void main(String[] args) {
		System.out.println(returnSomeValue());
	}
	
	@SuppressWarnings("finally")
	public static int returnSomeValue(){
		try {
			return 1;
		} catch (Exception exception){
			return 2;
		} finally {
			return 3;
		}
	}
}
