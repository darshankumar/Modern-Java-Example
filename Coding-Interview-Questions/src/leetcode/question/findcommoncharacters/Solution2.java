package leetcode.question.findcommoncharacters;

// Java program to print common characters 
// of two Strings in alphabetical order 
import java.io.IOException;

// Function to find similar characters 
public class Solution2 {
	static final int MAX_CHAR = 26;

	static void printCommon(String s1, String s2) {
		// two arrays of length 26 to store occurrence
		// of a letters alphabetically for each string
		int[] a1 = new int[MAX_CHAR];
		int[] a2 = new int[MAX_CHAR];

		int length1 = s1.length();
		int length2 = s2.length();

		for (int i = 0; i < length1; i++)
			a1[s1.charAt(i) - 'a']++;

		for (int i = 0; i < length2; i++)
			a2[s2.charAt(i) - 'a']++;

		// If a common index is non-zero, it means
		// that the letter corresponding to that
		// index is common to both strings
		for (int i = 0; i < MAX_CHAR; i++) {
			if (a1[i] != 0 && a2[i] != 0) {
				// Find the minimum of the occurrence
				// of the character in both strings and print
				// the letter that many number of times
				for (int j = 0; j < Math.min(a1[i], a2[i]); j++)
					System.out.print(((char) (i + 'a')));
			}
		}
	}

	// Driver code
	public static void main(String[] args) throws IOException {
		String s1 = "bella"; String s2 = "label";
		printCommon(s1, s2);
	}
}
