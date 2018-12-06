package singlelinkedlist;

import singlelinkedlist.Traversal_2.Node;

public class FindMiddle_11 {
	Node head; // head of linked list

	/*
	 * Method 1 (Two pass): Traverse the whole linked list and count the no. of
	 * nodes. Now traverse the list again till count/2 and return the node at
	 * count/2.
	 */
	/* Returns count of nodes in linked list */
	public int getCountRec(Node node) {
		// Base case
		if (node == null)
			return 0;

		// Count is this node plus rest of the list
		return 1 + getCountRec(node.next);
	}

	void printMiddle2() {
		int count = getCountRec(head);
		System.out.println("count = " + count);

		Node n = head;
		for (int i = 0; i < count; i++) {
			if (i == ((count / 2) - 1)) {
				System.out.println("Middle = " + n.next.data);
				break;
			} else {
				n = n.next;
			}

		}
	}

	/*
	 * Method 2 (Single pass): Traverse linked list using two pointers. Move one
	 * pointer by one and other pointer by two. When the fast pointer reaches
	 * end, slow pointer will reach middle of the linked list.
	 */
	void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("The middle element is [" + slow_ptr.data + "] \n");
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/*
	 * This function prints contents of linked list starting from the given node
	 */
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		FindMiddle_11 llist = new FindMiddle_11();
		for (int i = 6; i > 0; --i) {
			llist.push(i);
			llist.printList();
			llist.printMiddle();
		}

		System.out.println("--------TWO PASS---------");
		llist.printList();
		llist.printMiddle2();
	}
}
