package leetcode.question.k_diff_pairs_array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
	public static int findPairs(int[] nums, int k) {

		if (k < 0) {
			return 0;
		}

		Set<Integer> numSet = new HashSet<Integer>();
		Map<Integer, Set<String>> differenceMap = new HashMap<Integer, Set<String>>();
		differenceMap.put(k, new HashSet<String>());

		for (int num : nums) {

			int minus_result = num - k;
			int plus_result = num + k;

			if (numSet.contains(minus_result)) {
				Set<String> set = differenceMap.get(k);
				String pair = "[" + minus_result + " " + num + "]";
				set.add(pair);
				differenceMap.put(k, set);
			}

			if (numSet.contains(plus_result)) {
				Set<String> set = differenceMap.get(k);
				String pair = "[" + num + " " + plus_result + "]";
				set.add(pair);
				differenceMap.put(k, set);
			}

			numSet.add(num);
		}
		System.out.println(differenceMap);
		return differenceMap.get(k).size();
	}

	public static int findPairs2(int[] nums, int k) {
		if (k < 0)
			return 0;
		Map<Integer, Integer> map = new HashMap<>();
		int res = 0;
		for (int i : nums) {
			if (map.containsKey(i)) {
				if (k == 0 && map.get(i) == 1) {
					map.put(i, map.get(i) + 1);
					res++;
				}
				continue;
			}
			res += map.getOrDefault(i + k, 0);
			res += map.getOrDefault(i - k, 0);
			map.put(i, 1);
		}
		return res;
	}

	public int findPairs3(int[] nums, int k) {
		if (k < 0) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<>();
		int result = 0;
		for (int i : nums) {
			if (map.containsKey(i)) {
				if (k == 0 && map.get(i) == 1) {
					result++;
				}
				map.put(i, map.get(i) + 1);
			} else {
				if (map.containsKey(i - k)) {
					result++;
				}
				if (map.containsKey(i + k)) {
					result++;
				}
				map.put(i, 1);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1, 4, 1, 5 }; // 3,1,4,5
		System.out.println(findPairs(nums, 2)); // (1, 3) and (3, 5) ->2

		int[] nums2 = { 1, 2, 3, 4, 5 };
		System.out.println(findPairs(nums2, 1)); // (1, 2), (2, 3), (3, 4) and (4, 5). ->4

		int[] nums3 = { 1, 3, 1, 5, 4 };
		System.out.println(findPairs(nums3, 0)); // (1, 1) ->1

		int[] nums4 = { 1, 1, 1, 2, 1 };
		System.out.println(findPairs(nums4, 1)); // (1, 1) ->1

		int[] nums5 = { 1, 2, 3, 4, 5 };
		System.out.println(findPairs(nums5, 0)); // (1, 1) ->1

	}
}