package leetcode.question.queue_from_stack;

import java.util.Stack;

public class Solution2 {

	public static void main(String[] args) {
		MyQueuee myQueue = new MyQueuee();

		for (int i = 0; i < 10; i++) {
			myQueue.push(i);
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("i =   " + i + "   pop= " + myQueue.pop());
			System.out.println("i =   " + i + "   peek= " + myQueue.peek());
		}

	}

}

class MyQueuee {

	private Stack<Integer> s1;
	private Stack<Integer> s2;
	private int front;

	/** Initialize your data structure here. */
	public MyQueuee() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		if (s1.empty())
			front = x;
		s1.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		if (s2.isEmpty()) {
			while (!s1.isEmpty())
				s2.push(s1.pop());
		}
		return s2.pop();
	}

	/** Get the front element. */
	public int peek() {
		if (!s2.isEmpty()) {
			return s2.peek();
		}
		return front;
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}
}
