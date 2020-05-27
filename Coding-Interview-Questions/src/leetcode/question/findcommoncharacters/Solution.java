package leetcode.question.findcommoncharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public static List<String> commonChars(String[] A) {
		List<String> common_chars = new ArrayList();
		int[] min_freq = new int[26]; /// array of 26 --- to put a to z count
		Arrays.fill(min_freq, Integer.MAX_VALUE); // fill it with max count
		
		
		for(String current_str:A) {
			int[] chars_freq = new int[26]; // count char occourence in each string
			
			for(char c: current_str.toCharArray()) {
				chars_freq[c-'a'] ++; // get current occurence of char in this string
			}
			
			for(int i=0;i<26;i++) {
				min_freq[i] = Math.min(min_freq[i], chars_freq[i]);  // find min number of occurence for each 
			}
			
			for(int i=0;i<26;i++) {
				while(min_freq[i]>0) {
					common_chars.add("" + (char) (i+'a')); // add duplicate or common char to min frqu
					min_freq[i]--; // reduce min-frequenc so that i wil count for next string
				}
			}
		}
		
		return common_chars;
    }

	public static void main(String[] args) {
		String[] a = { "bella", "label", "roller" };
		System.out.println(commonChars(a));
	}
}