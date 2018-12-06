package ubs;

public class Test5 {
	public static void main(String[] args) {
		{
			int var1 = 5;
			int var2 = 5;

			if ((var2 = 1) == var1) {
				System.out.println(var2);
			} else {
				System.out.println(++var2);
			}

		}
	}
}
