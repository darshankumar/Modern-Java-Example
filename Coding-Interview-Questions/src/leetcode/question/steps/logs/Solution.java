package leetcode.question.steps.logs;

public class Solution {

	public static void steps2(int n) {
		int start = 1;

		while (start <= n) {
			// System.out.print(".");
			int left = 1;
			while (left <= start) {
				System.out.print("#");
				left++;
			}
			System.out.println("");
			start++;
		}

	}

	public static void steps3(int n) {
		for (int row = 0; row < n; row++) {
			String stair = "";
			for (int col = 0; col < n; col++) {
				if (col <= row) {
					stair += "#";
				} else {
					stair += " ";
				}

			}
			System.out.println(stair);
		}

	}

	private static void getStep(int n, int row, String str) {
		if (n == row) {
			return;
		}

		if (n == str.length()) {
			System.out.println(str);
			getStep(n, row + 1, "");
			return;
		}

		if (str.length() <= row) {
			str += "#";
		} else {
			str += " ";
		}
		getStep(n, row,str);
	}

	public static void main(String[] args) {
		getStep(10, 0, "");
	}

}
