package leetcode.question.scramble_string;

import java.util.Arrays;

public class Solution {

	public static boolean isScramble(String s1, String s2) {
		if (!isAnagram(s1, s2))
			return false;
		// base case : s1 and s2 are leaf
		if (s1.length() == 1)
			return true;
		int len = s1.length();
		// treat substrings of s1 and s2 as nodes
		// partitioning s1 to 2 non-empty substrings from left to right
		// if s1 has length > 1, substrings of s1 are non-leaf nodes, we can swap them
		// Thus, we partition s2 to 2 non-empty substrings from left to right and from
		// right to left, to check with s1's substrings
		// recursively check if substrings of s1 and s2 are anagram accordingly (if s2
		// is created from s1 by swapping)
		for (int i = 0; i < len - 1; i++) {
			if (isScramble(s1.substring(0, i + 1), s2.substring(0, i + 1))
					&& isScramble(s1.substring(i + 1, len), s2.substring(i + 1, len)))
				return true;
			if (isScramble(s1.substring(0, i + 1), s2.substring(len - (i + 1), len))
					&& isScramble(s1.substring(i + 1, len), s2.substring(0, len - (i + 1))))
				return true;
		}
		return false;
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		if (s.equals(t))
			return true;
		char[] data1 = s.toCharArray();
		Arrays.sort(data1);

		char[] data2 = t.toCharArray();
		Arrays.sort(data2);

		return Arrays.equals(data1, data2);
	}

	public static void main(String[] args) {
		System.out.println(isScramble2("great", "rgeat"));
		System.out.println(isScramble2("abcde", "caebd"));

	}

	public static boolean isScramble2(String s1, String s2) {

		// if both equal - return true
		if (s1.equals(s2)) {
			return true;
		}

		// string should be anagram first to be scramble

		int s1Array[] = new int[26];
		int s2Array[] = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			s1Array[s1.charAt(i) - 'a']=1;
			s2Array[s2.charAt(i) - 'a']=1;
		}

		if (!Arrays.equals(s1Array, s2Array)) {
			return false; // As they are not anagram so can't be scramble as well
		}

		// starting from 1 not from 0
		for (int i = 1; i < s1.length(); i++) {
			// we check is left part with left part of other string

			if (isScramble2(s1.substring(0, i), s2.substring(0, i)) && isScramble2(s1.substring(i), s2.substring(i))) {
				return true;
			}
			// we check is left part with right part of other string
			if (isScramble2(s1.substring(0, i), s2.substring(s1.length() - i))
					&& isScramble2(s1.substring(i), s2.substring(0, s1.length() - i))) {
				return true;
			}

			// we check is right part
		}

		return false;
	}
}
