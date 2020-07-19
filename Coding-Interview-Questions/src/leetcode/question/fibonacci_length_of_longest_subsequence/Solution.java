package leetcode.question.fibonacci_length_of_longest_subsequence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static int lenLongestFibSubseq(int[] A) {

		if (A == null || A.length == 0) {
			return 0;
		}
		int len = A.length;
		int[][] dp = new int[len][len];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); //

		for (int i = 0; i < len; i++) {
			map.put(A[i], i); // value --> index map
			for (int j = i + 1; j < len; j++) {
				dp[i][j] = 2;
			}
		}
		
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				int k = A[j] + A[i];
				if (map.containsKey(k)) {
					int index = map.get(k);
					dp[j][index] = dp[i][j] + 1;
				}
			}
		}

		int res = 0;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {

				res = Math.max(res, dp[i][j]);
			}
		}

		return res == 2 ? 0 : res;

	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(lenLongestFibSubseq(A));
		int[] B = { 1, 3, 7, 11, 12, 14, 18 };
		System.out.println(lenLongestFibSubseq(B));
	}

}
