package leetcode.question.intersectionoftwoarrays;

import java.util.HashSet;

class Solution {
	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int i : nums1) {
			set1.add(i); // take all unique element of first array
		}

		HashSet<Integer> set2 = new HashSet<Integer>();
		for (int i : nums2) {
			if (set1.contains(i)) {
				set2.add(i);  // if present in first array then add in uique set for other too
			}
		}

		int[] result = new int[set2.size()];
		int i = 0;
		for (int n : set2) {
			result[i++] = n; // create new array from common element
		}

		return result;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,2,1};
		int[] b = {2,2};
		System.out.println(intersection(a, b));
	}
}