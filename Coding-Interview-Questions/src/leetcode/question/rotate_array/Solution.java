package leetcode.question.rotate_array;

import java.util.Arrays;

public class Solution {

	public static void rotate(int[] nums, int k) {
		if (k > nums.length)
			k = k % nums.length;
		int[] result = new int[nums.length];
		for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i]; // move last kth element to first in array
		}
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j]; // then copy rest of element
			j++;
		}
		System.arraycopy(result, 0, nums, 0, nums.length); //

	}

	public static void rotate2(int[] arr, int order) {
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

	// This is solution
	public static void rotate3(int[] nums, int k) {
		int temp, previous;
		for (int i = 0; i < k; i++) {
			previous = nums[nums.length - 1];
			for (int j = 0; j < nums.length; j++) {
				temp = nums[j];
				nums[j] = previous;
				previous = temp;
			}
		}
	}

	public static void rotate4(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Before Roate ---> " + Arrays.toString(a));
		rotate2(a, 18);
		System.out.println("After Roate ---> " + Arrays.toString(a));

		int[] b = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Before Roate ---> " + Arrays.toString(b));
		rotate2(b, 3);
		System.out.println("After Roate ---> " + Arrays.toString(b));

	}

}
