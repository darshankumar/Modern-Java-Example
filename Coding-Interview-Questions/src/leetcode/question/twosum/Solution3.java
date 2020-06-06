package leetcode.question.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution3 {
	public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				ans[0]=i;
				ans[1]=map.get(target-nums[i]); 
			}
			map.put(nums[i], i);
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		System.out.println(Arrays.toString(twoSum(nums, 9)));

	}
}