package Item11CHECK;

public class Stack_2_Demo {
	public static void main(String[] args) {
		Stack_2 stack_2 = new Stack_2();
		stack_2.push("Singapore");
		stack_2.push("Hongkong");
		System.out.println(stack_2);

		stack_2.pop();

		Stack_2 clonedStack = stack_2.clone();
		System.out.println(clonedStack);
	}
}
