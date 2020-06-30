package leetcode.question.same_tree;

class Solution {

	public static boolean isSameTree(TreeNode a, TreeNode b) {
		if(a==null && b==null) return true;
		if(a!=null && b!=null) {
			return (a.val==b.val && isSameTree(a.left, b.left) && isSameTree(a.right, b.right));
		}
		return false;
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