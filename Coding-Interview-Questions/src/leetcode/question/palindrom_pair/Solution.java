package leetcode.question.palindrom_pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static List<List<Integer>> palindromePairs(String[] words) {

		List<List<Integer>> output = new ArrayList<List<Integer>>();

		if (words == null || words.length < 2) {
			return output;
		}

		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {

				if (isPalindrome(words[i] + words[j])) {

					output.add(Arrays.asList(i, j));
					System.out.println("i--------> " + i + "j-----------> " + j);
				}
				if (isPalindrome(words[j] + words[i])) {

					output.add(Arrays.asList(j, i));
					System.out.println("i--------> " + i + "j-----------> " + j);
				}

			}
		}

		return output;
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
