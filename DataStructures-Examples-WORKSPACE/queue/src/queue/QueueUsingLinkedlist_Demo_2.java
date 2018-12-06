package queue;

public class QueueUsingLinkedlist_Demo_2 {
	public static void main(String[] args) {
		QueueUsingLinkedlist q = new QueueUsingLinkedlist();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		q.dequeue();
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);

		System.out.println("Dequeued item is " + q.dequeue().data);
	}
}
