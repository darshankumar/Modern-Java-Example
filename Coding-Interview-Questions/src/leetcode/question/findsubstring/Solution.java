package leetcode.question.findsubstring;

public class Solution {

	public static void main(String[] args) {

		System.out.println(isSubString("fstirst", "st"));
	}

	private static boolean isSubString(String i_StringForSearch, String i_SubStringToFind) {
		int j = 0;
		for (int i = 0; i < i_StringForSearch.length(); i++) {
			if (i_StringForSearch.charAt(i) == i_SubStringToFind.charAt(j)) {
				j++;
				if (j == i_SubStringToFind.length()) {
					return true;
				}
			}
		}
		return false;

	}

}
