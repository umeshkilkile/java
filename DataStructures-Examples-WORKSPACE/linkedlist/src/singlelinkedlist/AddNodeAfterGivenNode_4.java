package singlelinkedlist;

import singlelinkedlist.Traversal_2.Node;

/*
 * We are given pointer to a node, and the new node is inserted after the given node.
 */
public class AddNodeAfterGivenNode_4 {
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
	 * This function is in LinkedList class. Inserts a new node after the given
	 * prev_node. This method is defined inside LinkedList class shown above.
	 * 
	 * Time complexity of insertAfter() is O(1) as it does constant amount of
	 * work.
	 */
	public static void insertAfter(Node prev_node, int new_data) {
		/* 1. Check if the given Node is null */
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		/*
		 * 2. Allocate the Node & 3. Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 4. Make next of new Node as next of prev_node */
		new_node.next = prev_node.next;

		/* 5. make next of prev_node as new_node */
		prev_node.next = new_node;
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
		insertAfter(second, 100);

		printList();
	}
}
