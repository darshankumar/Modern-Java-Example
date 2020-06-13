package leetcode.question.queue_from_stack;

public class Solution {

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue(10);

		for (int i = 0; i < 10; i++) {
			myQueue.push(i);
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("i =   " + i + "   pop= " + myQueue.pop());
			System.out.println("i =   " + i + "   peek= " + myQueue.peek());
		}

	}

}

class MyQueue {
	private MyStack s1;
	private MyStack s2;
	private int front;

	public MyQueue(int size) {
		s1 = new MyStack(size);
		s2 = new MyStack(size);
	}

	public int pop() {
		int output = s1.pop();
		if (!empty())
			front = s1.peek();
		return output;
	}

	public void push(int x) {
		if (s1.isEmpty())
			front = x;
		while (!empty())
			s2.push(s1.pop());
		s2.push(x);
		while (!s2.isEmpty())
			s1.push(s2.pop());
	}

	public boolean empty() {
		return s1.isEmpty();
	}

	public int peek() {
		return front;
	}

}

class MyStack {

	int[] data;
	int top;
	int size;

	public MyStack(int size) {
		this.data = new int[size];
		this.size = size;
		this.top = -1;
	}

	public void push(int v) {
		if (!isFull()) {
			top++;
			data[top] = v;
			// System.out.println("Pushed element:" + v);
		} else {
			System.out.println("Stack is full !");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			// System.out.println("Popped element :" + data[returnedTop]);
			return data[returnedTop];

		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}

	public int peek() {
		if (!this.isEmpty())
			return data[top];
		else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}
}