package leetcode.question.palindrom_pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public static List<List<Integer>> palindromePairs(String[] words) {

		List<List<Integer>> output = new ArrayList<List<Integer>>();
		Set<String> paliSet = new HashSet<String>();

		if (words == null || words.length < 2) {
			return output;
		}

		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {

				if (!paliSet.contains(words[i] + words[j])) {
					if (isPalindrome(words[i] + words[j])) {
						output.add(Arrays.asList(i, j));
						System.out.println("i--------> " + i + "j-----------> " + j);
						paliSet.add(words[i] + words[j]);
					}
				} else {
					output.add(Arrays.asList(i, j));
				}

				if (!paliSet.contains(words[j] + words[i])) {
					if (isPalindrome(words[j] + words[i])) {
						output.add(Arrays.asList(j, i));
						System.out.println("i--------> " + i + "j-----------> " + j);
						paliSet.add(words[j] + words[i]);
					}
				} else {
					output.add(Arrays.asList(j, i));
				}

			}
		}

		return output;
	}

	public List<List<Integer>> palindromePairs2(String[] words) {
		List<List<Integer>> result = new ArrayList<>();
		if (words == null || words.length < 2) {
			return result;
		}
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			map.put(words[i], i);
		}
		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			for (int k = 0; k <= s.length(); k++) {
				String left = s.substring(0, k);
				String right = s.substring(k);
				// if left part is palindrome, find reversed right part
				if (isPalindrome(left)) {
					String reversedRight = new StringBuilder(right).reverse().toString();
					if (map.containsKey(reversedRight) && map.get(reversedRight) != i) {
						ArrayList<Integer> l = new ArrayList<>();
						l.add(map.get(reversedRight));
						l.add(i);
						result.add(l);
					}
				}
				// if right part is a palindrome, find reversed left part
				if (isPalindrome(right)) {
					String reversedLeft = new StringBuilder(left).reverse().toString();
					if (map.containsKey(reversedLeft) && map.get(reversedLeft) != i && right.length() != 0) {
						// make sure right is not "", already handled in the if above
						ArrayList<Integer> l = new ArrayList<>();
						l.add(i);
						l.add(map.get(reversedLeft));
						result.add(l);
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] words = { "abcd", "dcba", "lls", "s", "sssll" };

		System.out.println(palindromePairs(words));

		String[] words2 = { "bat", "tab", "cat" };

		System.out.println(palindromePairs(words2));
	}

	public static boolean isPalindrome(String s) {
		return s.contentEquals(new StringBuffer(s).reverse().toString());
	}

}
