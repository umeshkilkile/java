package queue;

public class QueueUsingArray_Demo_1 {
	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		int a = queue.dequeue();
		System.out.println(a);

		int front = queue.front();
		System.out.println("front = " + front);

		int rear = queue.rear();
		System.out.println("rear = " + rear);
	}
}
