package singlelinkedlist;

//A simple Java program to introduce a linked list
public class SimpleLinkedList_1 {
	Node head; // head of list

	/*
	 * Linked list Node. This inner class is made static so that main() can
	 * access it
	 */
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		} // Constructor
		
		@Override
		public String toString() {
			return "" + data;
		}
	}

	@Override
	public String toString() {
		return head.toString();
	}
	
	/* This function prints contents of linked list starting from head */
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	/* method to create a simple linked list with 3 nodes */
	public static void main(String[] args) {
		/* Start with the empty list. */
		SimpleLinkedList_1 llist = new SimpleLinkedList_1();

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

     /* Three nodes have been allocated  dynamically.
       We have refernces to these three blocks as first,  
       second and third

       llist.head        second              third
          |                |                  |
          |                |                  |
      +----+------+     +----+------+     +----+------+
      | 1  | null |     | 2  | null |     |  3 | null |
      +----+------+     +----+------+     +----+------+ */

     llist.head.next = second; // Link first node with the second node

     /*  Now next of first Node refers to second.  So they
         both are linked.

      llist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 1  |  o-------->| 2  | null |     |  3 | null |
     +----+------+     +----+------+     +----+------+ */

     second.next = third; // Link second node with the third node

     /*  Now next of second Node refers to third.  So all three
         nodes are linked.

      llist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 1  |  o-------->| 2  |  o-------->|  3 | null |
     +----+------+     +----+------+     +----+------+ */
     
		System.out.println(llist.head.data + " -> " + llist.head.next);
		System.out.println(llist.head.next.data + " -> " + llist.head.next.next);
		System.out.println(llist.head.next.next.data + " -> " + llist.head.next.next.next);
	}
}
/*
 * Linked List
 * 
 * - Like arrays, Linked List is a linear data structure.
 * 
 * - Unlike arrays, linked list elements are not stored at contiguous location;
 * the elements are linked using pointers.
 * 
 * Why Linked List?
 * 
 * - Arrays can be used to store linear data of similar types, but arrays have
 * following limitations.
 * 
 * - 1) The size of the arrays is fixed: So we must know the upper limit on the
 * number of elements in advance. Also, generally, the allocated memory is equal
 * to the upper limit irrespective of the usage.
 * 
 * - 2) Inserting a new element in an array of elements is expensive, because
 * room has to be created for the new elements and to create room existing
 * elements have to shifted.
 * 
 * 
 * - For example, in a system if we maintain a sorted list of IDs in an array
 * id[].
 * 
 * id[] = [1000, 1010, 1050, 2000, 2040].
 * 
 * - And if we want to insert a new ID 1005, then to maintain the sorted order,
 * we have to move all the elements after 1000 (excluding 1000).
 * 
 * - Deletion is also expensive with arrays until unless some special techniques
 * are used. For example, to delete 1010 in id[], everything after 1010 has to
 * be moved.
 * 
 * - Advantages over arrays
 * 
 * - 1) Dynamic size
 * 
 * - 2) Ease of insertion/deletion
 * 
 * - Drawbacks:
 * 
 * - 1) Random access is not allowed. We have to access elements sequentially
 * starting from the first node. So we cannot do binary search with linked
 * lists. - 2) Extra memory space for a pointer is required with each element of
 * the list.
 */