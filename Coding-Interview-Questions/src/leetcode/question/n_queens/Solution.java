package leetcode.question.n_queens;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<>();
		char board[][] = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}
		dfs(board, result, 0, n);
		return result;
	}

	public static void dfs(char board[][], List<List<String>> result, int row, int n) {
		if (row == n) {
			construct(board, result);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (isValid(board, row, i)) {
				board[row][i] = 'Q';
				dfs(board, result, row + 1, n);
				board[row][i] = '.';
			}
		}
	}

	public static boolean isValid(char board[][], int r, int c) {
		int b = c - 1; // above colum
		int f = c + 1; // below column
		for (int i = r - 1; i >= 0; i--) {
			if (board[i][c] == 'Q')
				return false;
			if (b >= 0 && board[i][b] == 'Q')
				return false;
			if (f < board.length && board[i][f] == 'Q')
				return false;
			b--;
			f++;
		}
		return true;
	}

	public static void construct(char board[][], List<List<String>> result) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			list.add(String.valueOf(board[i]));
		}
		result.add(list);
	}

	public static void main(String[] args) {
		System.out.println(solveNQueens(4));

		//System.out.println(solveNQueens(6));
	}
}
