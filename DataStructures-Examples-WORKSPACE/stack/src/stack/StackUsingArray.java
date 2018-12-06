package stack;

/*
 * Stack implementation using Array
 */
public class StackUsingArray {
	static final int MAX = 5;
	int top;
	// Maximum size of Stack
	int a[] = new int[MAX];

	StackUsingArray() {
		top = -1;
	}

	boolean isEmpty() {
		return top < 0;
	}

	boolean push(int value) {
		if (top >= MAX) {
			System.out.println("Stack overflow!");
			return false;
		} else {
			a[++top] = value;
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow!");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	void print() {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
/*
 * Stack is a linear data structure which follows a particular order in which
 * the operations are performed. The order may be LIFO(Last In First Out) or
 * FILO(First In Last Out).
 * 
 * Basic operations on Stack - push - pop - peek or top - isEmpty
 * 
 * Applications of stack:
 * 
 * - Balancing of symbols
 * 
 * - Infix to Postfix /Prefix conversion
 * 
 * - Redo-undo features at many places like editors, photoshop.
 * 
 * - Forward and backward feature in web browsers
 * 
 * - Used in many algorithms like Tower of Hanoi, tree traversals, stock span
 * problem, histogram problem.
 * 
 * - Other applications can be Backtracking, Knight tour problem, rat in a maze,
 * N queen problem and sudoku solver
 */
