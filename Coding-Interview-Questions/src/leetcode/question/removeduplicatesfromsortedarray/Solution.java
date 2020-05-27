package leetcode.question.removeduplicatesfromsortedarray;

class Solution {

	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;// for next element
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		nums[j] = nums[n - 1];
		j++;
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int length = arr.length;
		length = removeDuplicates(arr);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}
}