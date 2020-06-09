package leetcode.question.find_all_anagrams_in_a_string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static List<Integer> findAnagrams(String s, String p) {
		int start = 0;
		int end = p.length() - 1;
		List<Integer> list = new ArrayList<>();
		//
		if (p.length() > s.length() || start > 0)
			return list;

		// create frequency map for each String
		Map<Character, Integer> maps = new HashMap<Character, Integer>();
		Map<Character, Integer> mapp = new HashMap<Character, Integer>();

		// p frequency map
		for (int i = 0; i < p.length(); i++) {
			char ch = p.charAt(i);
			mapp.put(ch, mapp.getOrDefault(ch, 0) + 1);
		}

		// s frequency map
		for (int i = 0; i <= end; i++) {
			char ch = s.charAt(i);
			maps.put(ch, maps.getOrDefault(ch, 0) + 1);
		}

		if (maps.equals(mapp))
			list.add(start);

		// move to next start
		start++;
		end++;

		while (end < s.length()) {
			char ch = s.charAt(end);
			maps.put(ch, maps.getOrDefault(ch, 0) + 1); // adding end char to map

			ch = s.charAt(start - 1);
			if (maps.containsKey(ch)) {
				maps.put(ch, maps.getOrDefault(ch, 0) - 1); // reduce its count
				if (maps.get(ch) == 0) {
					maps.remove(ch);// remove last first char
				}
			}
			if (maps.equals(mapp))
				list.add(start);
			// move to next start
			start++;
			end++;
		}

		return list;

	}

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		System.out.println(findAnagrams(s, p));

		s = "abab";
		p = "ab";
		System.out.println(findAnagrams(s, p));
	}

}
