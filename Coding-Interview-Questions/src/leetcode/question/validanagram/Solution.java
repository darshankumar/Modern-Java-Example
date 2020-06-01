package leetcode.question.validanagram;

import java.util.Arrays;

public class Solution {

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
		System.out.println(isAnagram("anagram", "nagaram"));
		System.out.println(isAnagram("rat", "car"));
	}

}
