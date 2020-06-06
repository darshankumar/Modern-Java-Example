package leetcode.question.twosum;

import java.util.Arrays;

class Solution2 {
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					if (nums[i] + nums[j] == target)
						return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums = { 15, 7, 11, 2 };
		System.out.println(Arrays.toString(twoSum(nums, 9)));

	}
}