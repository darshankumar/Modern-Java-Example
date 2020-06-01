package leetcode.question.maximumoccurringcharacterstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	// using two pointer
	public static char maxOccurence(char[] s) {
		Map<Character, Integer> map = new HashMap();
		char maxChar = 0;
		int max = 0;
		int currentCount = 0;

		for (char c : s) {
			if (map.get(c) == null) {
				map.put(c, 1);
			} else {
				currentCount = map.get(c);
				currentCount = currentCount + 1;

				if (currentCount > max) {
					max = currentCount;
					maxChar = c;
				}

				map.put(c, currentCount);
			}
		}
		// System.out.println(map);
		// System.out.println(max);
		// System.out.println(maxChar);

		return maxChar;
	}

	public static char maxOccurence2(char[] s) {
		Map<Character, Integer> map = new HashMap();
		char maxChar = 0;
		int max = 0;
		int currentCount = 0;

		for (char c : s) {
			if (map.get(c) == null) {
				map.put(c, 1);
			} else {
				currentCount = map.get(c);
				currentCount = currentCount + 1;
				map.put(c, currentCount);
			}
		}

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			Character key = e.getKey();
			Integer value = e.getValue();
			if (value > max) {
				max = value;
				maxChar = key;
			}
		}
		return maxChar;
	}

	public static void main(String[] args) {
		char[] a = { 'h', 'e', 'l', 'l', 'o', 'o', 'o' };
		System.out.println(maxOccurence2(a));

		char[] b = { 'h', 'e', 'l', 'l' };
		System.out.println(maxOccurence2(b));

	}

}
