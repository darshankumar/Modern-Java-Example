package leetcode.question.reversestring;

public class Solution {
	
	// using two pointer 
	 public static void reverseString(char[] s) {
		 int ltr = 0;
		 int rtl = s.length-1;
		 
		 while(ltr<rtl) {
			 helper(s,ltr,rtl);
			 ltr++;
			 rtl = rtl-ltr;
		 }
		 
	 }
	 
	public static void main(String[] args) {
		char[] a = {'h','e','l','l','o'};
		reverseString(a);
		for(char c :a) {
			System.out.println(c);
		}
	}
	
	 public static void helper(char[] s,int start_pos, int last_pos){
		 char temp = s[last_pos];
		 s[last_pos] = s[start_pos];
		 s[start_pos] = temp;
	 }

}
