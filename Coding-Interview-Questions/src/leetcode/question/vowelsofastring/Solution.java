package leetcode.question.vowelsofastring;

public class Solution {

	public static int vowels(String str) {
		int v_count = 0;
		char[] charArray = str.toLowerCase().toCharArray();

		for (char c : charArray) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				v_count++;
			}
		}

		return v_count;
	}

	public static int vowels2(String str) {
		int v_count = 0;
		String checker = "aeiou";
		char[] charArray = str.toLowerCase().toCharArray();

		for (char c : charArray) {
			if (checker.indexOf(c) > 0) {
				v_count++;
			}
		}

		return v_count;
	}
	
	public static void main(String[] args) {
		String str = "Hi There";
		System.out.println(vowels(str));
		System.out.println(vowels2(str));

		str = "Why Do you ask ?";
		System.out.println(vowels(str));
		System.out.println(vowels2(str));
	}
}
