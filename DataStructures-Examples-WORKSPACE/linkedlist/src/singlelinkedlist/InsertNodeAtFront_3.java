package singlelinkedlist;

import singlelinkedlist.Traversal_2.Node;

/*
 * Add a node at the front: (A 4 steps process)
 * 
 * 	- The new node is always added before the head of the given Linked List. And newly added node becomes the new head of the Linked List. 
 * 
 *  - For example if the given Linked List is 10->15->20->25 and we add an item 5 at the front, 
 *  	then the Linked List becomes 5->10->15->20->25. 
 *  
 *  - Let us call the function that adds at the front of the list is push(). 
 *  
 *  - The push() must receive a pointer to the head pointer, because push must change the head pointer to point to the new node
 */
public class InsertNodeAtFront_3 {
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
	 * This function is in LinkedList class. Inserts a new Node at front of the
	 * list. 4 step process.
	 * 
	 * - Time complexity of push() is O(1) as it does constant amount of work.
	 */
	public static void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
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
		push(100);

		printList();
	}
}
