package singlelinkedlist;

/*
 * Iterative Solution

	1) Initialize count as 0 
	2) Initialize a node pointer, current = head.
	3) Do following while current is not NULL
	     a) current = current -> next
	     b) count++;
	4) Return count
 */
public class FindLengthRecursiveWay_9 {
	Node head; // head of list

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

	/* Returns count of nodes in linked list */
	public int getCount() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	/*
	 * Drier program to test above functions. Ideally this function should be in
	 * a separate user class. It is kept here to keep code compact
	 */
	public static void main(String[] args) {
		/* Start with the empty list */
		FindLengthRecursiveWay_9 llist = new FindLengthRecursiveWay_9();
		llist.push(1);
		llist.push(3);
		llist.push(1);
		llist.push(2);
		llist.push(1);

		System.out.println("Count of nodes is " + llist.getCount());
	}
}
