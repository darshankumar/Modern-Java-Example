package corejava.interview.question.find_the_celebrity;

import java.util.Stack;

class Solution {

	public int findCelebrity(int arr[][], int n) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			stack.push(i); // add all Celebrity in stack
		}

		while (stack.size() > 1) {
			int a = stack.pop(); // take a
			int b = stack.pop(); // take b

			if (arr[a][b] == 0) { // if a don't b
				stack.push(a); // a may be celebrity
			} else {
				stack.push(b);// b may be celebrity
			}
		} // now stack will be having only one item

		int x = stack.pop();// x left in satck --- is he celebrity
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (i != x) {
				if (arr[x][i] == 1 || arr[i][x] == 0) {
					flag = false; // x can't be celebrity if x know i OR i don't know x
				}
			}

		}

		if (!flag) {
			return -1;
		}
		return x;
	}
}