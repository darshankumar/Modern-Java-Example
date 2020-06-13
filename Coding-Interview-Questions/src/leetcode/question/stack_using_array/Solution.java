package leetcode.question.stack_using_array;

public class Solution {

	public static void main(String[] args) {
		MyStack myStack = new MyStack(10);
		for (int i = 0; i < 10; i++) {
			myStack.push(i);
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("i =   " + i + "   pop= " + myStack.pop());
			System.out.println("i =   " + i + "   peek= " + myStack.peek());
		}

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
			System.out.println("Pushed element:" + v);
		} else {
			System.out.println("Stack is full !");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + data[returnedTop]);
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