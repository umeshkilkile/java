package stack;

public class Stack_Demo_2 {
	public static void main(String[] args) {
		StackUsingLinkedList linkedList = new StackUsingLinkedList();

		linkedList.push(10);
		linkedList.push(20);
		linkedList.push(30);
		linkedList.push(40);
		linkedList.printList();

		int value = linkedList.pop();
		System.out.println("\nValue = " + value);
		linkedList.printList();

		int value2 = linkedList.pop();
		System.out.println("\nValue2 = " + value2);
		linkedList.printList();

		int value3 = linkedList.pop();
		System.out.println("\nValue3 = " + value3);
		linkedList.printList();
	}
}
