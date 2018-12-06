package stack;

public class StackUsingLinkedList {
	static final int MAX = 5;
	Node top;

	StackUsingLinkedList() {
		this.top = null;
	}

	public void push(int value) {
		Node newNode = new Node(value);
		if (top == null) {
			newNode.next = null;
		} else {
			newNode.next = top;
		}
		top = newNode;
	}

	public int pop() {
		if (top == null) {
			System.out.println("Stack underflow!");
			return 0;
		}
		top = top.next;
		return top.data;
	}

	public int peek() {
		if (top == null) {
			System.out.println("Stack underflow!");
			return 0;
		}
		return top.data;
	}

	public void printList() {
		Node n = top;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
}
