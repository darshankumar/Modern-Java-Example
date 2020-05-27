package leetcode.question.palindromenumber;

public class Solution {

	public static boolean isPalindrome(int x) {
		
		if (x < 0 || (x % 10 == 0 && x != 0)) { // is less then zero
												// means it has last digit az zero 
			return false;
		}

		int revertedNumber = 0;
		while (x > revertedNumber) {
			System.out.println(revertedNumber);
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}
		return x == revertedNumber || x == revertedNumber / 10;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(1213));
	}

}
