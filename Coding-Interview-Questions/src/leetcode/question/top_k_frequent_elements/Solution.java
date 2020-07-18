package leetcode.question.top_k_frequent_elements;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> fequencyMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			fequencyMap.put(nums[i], fequencyMap.get(nums[i]) == null ? 1 : fequencyMap.get(nums[i]) + 1);
		}

		Comparator<Pair> comparator = new Comparator<Pair>() {

			@Override
			public int compare(Pair p1, Pair p2) {
				if (p1.value < p2.value) {
					return 1;
				}
				return -1;
			}
		};

		PriorityQueue<Pair> pq = new PriorityQueue<Pair>(comparator);
		for (Integer key : fequencyMap.keySet()) {
			pq.add(new Pair(key, fequencyMap.get(key)));
		}

		int x = 0;
		int[] result = new int[k];
		while (!pq.isEmpty() && x < k) {
			result[x] = pq.poll().key;
			x++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		System.out.println(topKFrequent(nums, k));

		int[] nums2 = { 1 };
		k = 1;

		System.out.println(topKFrequent(nums2, k));
	}
}
