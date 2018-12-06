package singlelinkedlist;

import singlelinkedlist.Traversal_2.Node;

/*
 * Add a node at the end: (6 steps process)
		
		- The new node is always added after the last node of the given Linked List. 
		- For example if the given Linked List is 5->10->15->20->25 and we add an item 30 at the end, 
		then the Linked List becomes 5->10->15->20->25->30.
 */
public class AddNodeAtTheEnd_5 {
	static Node head; // head of list

	/* This function prints contents of linked list starting from head */
	public static void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println();
	}

	/*
	 * Appends a new node at the end. This method is defined inside LinkedList
	 * class shown above.
	 * 
	 * - Time complexity of append is O(n) where n is the number of nodes in
	 * linked list. Since there is a loop from head to end, the function does
	 * O(n) work.
	 * 
	 * - This method can also be optimized to work in O(1) by keeping an extra
	 * pointer to tail of linked list.
	 */
	public static void append(int new_data) {
		/*
		 * 1. Allocate the Node & 2. Put in the data 3. Set next as null
		 */
		Node new_node = new Node(new_data);

		/*
		 * 4. If the Linked List is empty, then make the new node as head
		 */
		if (head == null) {
			head = new Node(new_data);
			return;
		}

		/*
		 * 4. This new node is going to be the last node, so make next of it as
		 * null
		 */
		new_node.next = null;

		/* 5. Else traverse till the last node */
		Node last = head;
		while (last.next != null)
			last = last.next;

		/* 6. Change the next of last node */
		last.next = new_node;
		return;
	}

	/* method to create a simple linked list with 3 nodes */
	public static void main(String[] args) {
		/* Start with the empty list. */

		head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		head.next = second; // Link first node with the second node
		second.next = third; // Link first node with the second node

		printList();

		System.out.println("Add new node in front");
		append(100);

		printList();
	}
}
