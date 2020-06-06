package leetcode.question.validanagram;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		if (s.equals(t))
			return true;
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		// count each character put in map
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {

				map.put(s.charAt(i), i);
			}

		}

		// count each character and minus to map
		for (int i = 0; i < t.length(); i++) {
			if (map.containsKey(t.charAt(i))) {
				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
				if (map.get(t.charAt(i)) == 0) {
					map.remove(t.charAt(i));
				}

			} else {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("okt", "tkoo"));
		System.out.println(isAnagram("rat", "tar"));
	}

}
