package leetcode.question.symmetric_tree;

class Solution {

	 public static boolean isSymmetric(TreeNode root) {
		if(root==null) return true;
		return areMirror(root.left,root.right); 
	 }

	private static boolean areMirror(TreeNode a, TreeNode b) {
		if(a==null && b==null) return true;
		
		if(a!=null && b!=null) {
			return (a.val==b.val && areMirror(a.left, b.right) && areMirror(a.right, b.left));
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