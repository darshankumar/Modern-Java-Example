package leetcode.question.validpalindrome;

public class Solution {

	public static boolean isPalindrome(String s) {
		if (s.isEmpty()) return true;
		String output = new String();
		
		char[] char_array = s.toCharArray();
		for(char c:char_array) {
			if(Character.isLetterOrDigit(c)) {
				output = output+c;
			}
		}
		System.out.println(output);
		if(output.length()==1) return true;
		
		String result = new String();
		for(int i=output.length()-1;i>=0;i--) {
			result = result+output.charAt(i);
		}
		return output.equalsIgnoreCase(result);
		
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome("0P"));
	}
	
	
}
