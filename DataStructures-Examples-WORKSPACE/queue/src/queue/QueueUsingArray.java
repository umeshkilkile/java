package queue;

public class QueueUsingArray {
	int front, rear, size;
	int capacity;
	int array[];

	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	boolean isFull(QueueUsingArray queue) {
		return (queue.size == queue.capacity);
	}

	boolean isEmpty(QueueUsingArray queue) {
		return queue.size == 0;
	}

	void enqueue(int item) {
		if (isFull(this))
			return;
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " - enqueued to queue");
	}

	int dequeue() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}

	int front() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array[this.front];
	}

	int rear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array[this.rear];
	}
}

/*
 * Applications of Queue: Queue is used when things don’t have to be processed
 * immediately, but have to be processed in First InFirst Out order like Breadth
 * First Search. This property of Queue makes it also useful in following kind
 * of scenarios.
 * 
 * 1) When a resource is shared among multiple consumers. Examples include CPU
 * scheduling, Disk Scheduling.
 * 
 * 2) When data is transferred asynchronously (data not necessarily received at
 * same rate as sent) between two processes. Examples include IO Buffers, pipes,
 * file IO, etc.
 * 
 */