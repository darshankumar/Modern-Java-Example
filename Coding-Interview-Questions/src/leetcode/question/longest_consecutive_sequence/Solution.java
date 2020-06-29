package leetcode.question.longest_consecutive_sequence;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static int longestConsecutive(int[] nums) {
		int max = 0;
		if (nums.length == 0)
			return 0;

		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		for (int i : nums) {
			map.put(i, true);
		}
		System.out.println("map ---------------> " + map);
		// finding starting point
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			if (map.containsKey(key - 1)) {
				map.put(key, false);
			}
		}
		System.out.println("map ---------------> " + map);

		Set<Integer> keys2 = map.keySet();

		for (Integer key : keys2) {
			int c = 0;
			if (map.get(key)) { // check length of only true keys
				while (map.containsKey(key + c)) {
					c++;
				}
				if (c > max) {
					max = c; // get longest one only
				}
			}
			System.out.println("key -------------->c----------->max " + key + "------------------>" + c
					+ "---------------->" + max);
		}

		return max;
	}

	public static void main(String[] args) {
		int[] a = { 100, 4, 200, 1, 3, 2 };
		System.out.println(longestConsecutive(a));
		int[] b = { 100, 4, 200, 1, 3, 2 };
		System.out.println(longestConsecutive2(b));
	}

	public static int longestConsecutive2(int[] nums) {

		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num); // put all in set
		}

		int maxCounter = 0; // create a counter
		for (int num : set) {
			if (set.contains(num - 1)) {
				continue;
			}

			int curr = num; // check for each num whose -1 is present
			int counter = 1;
			while (set.contains(curr + 1)) {
				counter++; // get leneght
				curr++; // move to next present one
			}

			maxCounter = Math.max(counter, maxCounter);
		}

		return maxCounter;
	}

}
