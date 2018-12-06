package queue;

public class QueueUsingLinkedlist {
	Node front;
	Node rear;

	public QueueUsingLinkedlist() {
		this.front = this.rear = null;
	}

	void enqueue(int key) {
		// Create a new Linkedlist Node
		Node node = new Node(key);

		// If queue is empty, then new node is front and rear both
		if (this.rear == null) {
			this.front = this.rear = node;
			return;
		}

		// Add the new node at the end of queue and change rear
		this.rear.next = node;
		this.rear = node;
	}

	Node dequeue() {
		// If queue is empty, return NULL
		if (this.front == null)
			return null;

		// Store previous front and move front one node ahead
		Node node = this.front;
		this.front = this.front.next;

		// If front becomes NULL, then change rear also as NULL
		if (this.front == null)
			this.rear = null;

		return node;
	}
}
