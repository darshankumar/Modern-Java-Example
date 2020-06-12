package leetcode.question.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static List<List<String>> groupAnagrams(String[] str) {

		if (str.length == 0) {
			return new ArrayList();
		}
		Map<String, List> ans = new HashMap<String, List>();
		for (String s : str) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if (!ans.containsKey(key)) {
				ans.put(key, new ArrayList());
			}
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
	}

	public static void main(String[] args) {
		String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };

		System.out.println(groupAnagrams(s));
	}

}
