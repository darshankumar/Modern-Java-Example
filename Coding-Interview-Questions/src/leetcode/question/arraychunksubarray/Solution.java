package leetcode.question.arraychunksubarray;

import java.util.Arrays;

public class Solution {

	// using two pointer
	public static int[][] arrayChunkOfSize(int[] array, int chunkSize) {
		int numOfChunks = (int) Math.ceil((double) array.length / chunkSize);
		int[][] output = new int[numOfChunks][];

		for (int i = 0; i < numOfChunks; ++i) {
			int start = i * chunkSize;
			int length = Math.min(array.length - start, chunkSize);

			int[] temp = new int[length];
			temp = Arrays.copyOfRange(array, start, start + length);
			System.out.println(Arrays.toString(temp));
			output[i] = temp;
		}

		return output;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(arrayChunkOfSize(a, 2)));
	}

}
