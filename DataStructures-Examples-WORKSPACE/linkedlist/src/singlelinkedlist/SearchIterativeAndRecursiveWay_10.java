package singlelinkedlist;

public class SearchIterativeAndRecursiveWay_10 {
	Node head; // Head of list

	// Inserts a new node at the front of the list
	public void push(int new_data) {
		// Allocate new node and putting data
		Node new_node = new Node(new_data);

		// Make next of new node as head
		new_node.next = head;

		// Move the head to point to new Node
		head = new_node;
	}

	/*
	 * Iterative Solution
	 * 
	 * 1) Initialize a node pointer, current = head.
	 * 
	 * 2) Do following while current is not NULL
	 * 
	 * a) current->key is equal to the key being searched return true.
	 * 
	 * b) current = current->next
	 * 
	 * 3) Return false
	 */
	// Checks whether the value x is present in linked list
	public boolean search(Node head, int x) {
		Node current = head; // Initialize current
		while (current != null) {
			if (current.data == x)
				return true; // data found
			current = current.next;
		}
		return false; // data not found
	}

	/*
	 * Recursive Solution
	 * 
	 * bool search(head, x)
	 * 
	 * 1) If head is NULL, return false.
	 * 
	 * 2) If head's key is same as x, return true;
	 * 
	 * 3) Else return search(head->next, x)
	 */
	public boolean searchRecursiveWay(Node head, int x) {
		// Base case
		if (head == null)
			return false;

		// If key is present in current node,
		// return true
		if (head.data == x)
			return true;

		// Recur for remaining list
		return search(head.next, x);
	}

	// Driver function to test the above functions
	public static void main(String args[]) {

		// Start with the empty list
		SearchIterativeAndRecursiveWay_10 llist = new SearchIterativeAndRecursiveWay_10();

		/*
		 * Use push() to construct below list 14->21->11->30->10
		 */
		llist.push(10);
		llist.push(30);
		llist.push(11);
		llist.push(21);
		llist.push(14);

		if (llist.search(llist.head, 21))
			System.out.println("Yes");
		else
			System.out.println("No");

		if (llist.searchRecursiveWay(llist.head, 21))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
