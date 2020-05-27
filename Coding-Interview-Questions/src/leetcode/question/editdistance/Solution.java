package leetcode.question.editdistance;

class Solution {
	
	
	public static void main(String[] args) {
		System.out.println(minDistance("horse","ros"));
	}
	public static int minDistance(String word1, String word2) {
		return findDistance(word1, word2, word1.length(), word2.length());
	}

	private static int findDistance(String word1, String word2, int w1_length, int w2_length) {
		if (word1 == null || word2 == null) {
			return -1; // error
		}

		if (w1_length == 0) { // if first word is empty
			return w2_length;
		}

		if (w2_length == 0) { // if second word is empty
			return w1_length;
		}

		if (word1.charAt(w1_length - 1) == word2.charAt(w2_length - 1)) { // if last word is same then
			return findDistance(word1, word2, w1_length - 1, w2_length - 1); // start looking for second last word
		}

		return min(1 + findDistance(word1, word2, w1_length - 1, w2_length), // add 1 & find other distance to left side
				1 + findDistance(word1, word2, w1_length, w2_length - 1), // add 1 & find other distance to right side
				1 + findDistance(word1, word2, w1_length - 1, w2_length - 1) // add 1 & find other min distance to both
																				// side
		);
	}

	// find min of 2 number
	private static int min(int a, int b) {
		return (a < b) ? a : b;
	}

	// find min of 3 number
	private static int min(int a, int b, int c) {
		return min(min(a, b), c);
	}
}