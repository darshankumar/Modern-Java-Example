package leetcode.question.find_the_duplicate_number;

public class Solution {

	public static int findDuplicate(int[] nums) {
		int start = 0;
		int ends = nums.length - 1; // 4
		
		while (start < ends) {
			int mid = (start + ends) / 2; // 2
			int count = 0;
			for (int num : nums) {
				if (num <= mid)
					++count;
			}
			if (count <= mid) {
				start = mid + 1;
			} else {
				ends = mid;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		System.out.println(findDuplicate(nums));

		int[] nums2 = { 3, 1, 3, 4, 2 };
		System.out.println(findDuplicate(nums2));
	}

}
