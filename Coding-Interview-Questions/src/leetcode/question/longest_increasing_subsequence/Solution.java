package leetcode.question.longest_increasing_subsequence;

import java.util.Arrays;

public class Solution {

	public static int lengthOfLIS(int[] nums) {
		int len = nums.length;
		if(len==0) {
			return 0;
		}
		int[] lis = new int[len];
		Arrays.fill(lis, 1);

		for (int i = 1; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i] && lis[i] < lis[j] + 1)

					lis[i] = lis[j] + 1;

			}
		}
		Arrays.sort(lis);
		return lis[len - 1];
	}

	public static void main(String[] args) {
		int[] A = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(lengthOfLIS(A));
		int[] B = { 9, 4, 7, 2, 10 };
		System.out.println(lengthOfLIS(B));
		int[] C = { 20, 1, 15, 3, 10, 5, 8 };
		System.out.println(lengthOfLIS(C));
	}

}
