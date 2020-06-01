package leetcode.question.vowelsofastringreverse;

public class Solution {

	public static String reverseVowels(String str) {
		char[] arr = str.toCharArray();
		String vowels ="aeiouAEIOU";
		int start =0;
		int end = str.length()-1;
		
		while(start<end) {
			if(vowels.indexOf(str.charAt(start)) == -1) {
				start++;
				continue;
			}
			
			if(vowels.indexOf(str.charAt(end)) == -1) {
				end--;
				continue;
			}
			
			char data = arr[start];
	        arr[start]=arr[end];
	        arr[end]=data;
	 
	        start++;
	        end--; 
		}
		
		
		return new String(arr);
	}

	public static void main(String[] args) {
		String str = "leetcode";
		System.out.println(reverseVowels(str)); //leotcede
		// System.out.println(reverseVowels(str));

		/*
		 * str = "hello ?"; System.out.println(reverseVowels(str));
		 * System.out.println(reverseVowels(str));
		 */
	}
}
