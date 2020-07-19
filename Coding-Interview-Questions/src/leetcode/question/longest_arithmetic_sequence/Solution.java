package leetcode.question.longest_arithmetic_sequence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

	static int MAX_VAL = 10001;

	public int longestArithSeqLength2(int[] a) {
		int max = 1;
		int diff;
		int[][] dp = new int[a.length][MAX_VAL * 2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				diff = a[i] - a[j] + MAX_VAL;

				dp[i][diff] = dp[j][diff] + 1;
				max = Math.max(max, dp[i][diff]);
			}
		}
		return max + 1;
	}

	public static int longestArithSeqLength(int[] A) {
		if (A == null || A.length == 0) {
			return 0;
		}
		int len = A.length;
		Map<Integer, Integer> dp[] = new HashMap[len]; // map for each element
		for (int i = 0; i < len; i++) {
			dp[i] = new HashMap<Integer, Integer>();
		}

		for (int i = 1; i < len; i++) {
			for (int j = i - 1; j >= 0; j--) { // previous element of i to 0
				int k = A[i] - A[j]; // take difference for each previous element
				if (dp[j].containsKey(k)) {
					if (dp[i].containsKey(k) && dp[j].get(k) > dp[i].get(k)) {
						continue;
					} else {
						dp[i].put(k, dp[j].get(k) + 1);
					}
				} else {
					if (!dp[i].containsKey(k)) {
						dp[i].put(k, 1);
					}
				}
			}
		}
		int max = 0;
		for (int i = 0; i < dp.length; i++) {
			Set<Integer> keys = dp[i].keySet();
			for (Integer key : keys) {
				max = Math.max(max, dp[i].get(key));
			}
		}

		return max + 1;
	}

	public static void main(String[] args) {
		int[] A = { 3, 6, 9, 12 };
		System.out.println(longestArithSeqLength(A));
		int[] B = { 9, 4, 7, 2, 10 };
		System.out.println(longestArithSeqLength(B));
		int[] C = { 20, 1, 15, 3, 10, 5, 8 };
		System.out.println(longestArithSeqLength(C));

	}

}
