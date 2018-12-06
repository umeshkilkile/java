package stack;

public class Stack_Demo_1 {
	public static void main(String[] args) {
		StackUsingArray s = new StackUsingArray();
		s.push(10);
		s.push(20);
		s.push(30);
		s.print();

		int j = s.pop();
		System.out.println("Popped item = " + j);
		s.print();
	}
}
