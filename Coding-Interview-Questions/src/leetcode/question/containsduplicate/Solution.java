package leetcode.question.containsduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i]))
				return true;
			set.add(nums[i]);
		}
		return false;
	}

	public static boolean containsDuplicate2(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate2(nums));
		int[] nums2 = { 1, 2, 3, 4 };
		System.out.println(containsDuplicate2(nums2));
	}
}