package leetcode.question.capitalize.lette.word;

public class Solution {

	// using two pointer
	public static String capitalize1(String str) {
		String[] output = str.split(" ");
		String result = "";
		for (String out : output) {
			out = out.substring(0, 1).toUpperCase() + out.substring(1);
			result = result + " " + out;
		}
		return result;

	}

	public static String capitalize(String str) {
		char[] chararray = str.toCharArray();
		String result = "" + Character.toUpperCase(chararray[0]);
		for (int i = 1; i < chararray.length; i++) {
			if (chararray[i - 1] == ' ') {
				result = result + Character.toUpperCase(chararray[i]);
			} else {
				result = result + chararray[i];
			}
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(capitalize("how are you"));
	}

}
