package leetcode.question.path_sum;

class Solution {

	static boolean flag = false;

	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}

		if (root.val == sum && (root.left == null && root.right == null)) {
			return true;
		}

		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	}

	public static boolean hasPathSum2(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		boolean answer = hasPathSumhelper(root, 0, sum);
		flag = false;
		return answer;
	}

	private static boolean hasPathSumhelper(TreeNode root, int current_sum, int sum) {

		// if it's leaf node & check sum
		if (root.right == null && root.left == null) {
			if (root.val + current_sum == sum) {
				flag = true;
			}
		}

		// check for right tree
		if (root.right != null && root.left == null) {
			hasPathSumhelper(root.right, root.val + current_sum, sum);
		}

		// check for left tree
		if (root.right == null && root.left != null) {
			hasPathSumhelper(root.left, root.val + current_sum, sum);
		}

		// check for both ends

		if (root.right != null && root.left != null) {
			hasPathSumhelper(root.right, root.val + current_sum, sum);
			hasPathSumhelper(root.left, root.val + current_sum, sum);
		}

		return flag;
	}

	public class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {

	}
}