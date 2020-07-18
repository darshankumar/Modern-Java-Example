package leetcode.question.rotate_list;

public class Solution {

	public static ListNode rotateRight(ListNode head, int k) {

		ListNode slow = head;
		ListNode fast = head;
		if (head == null) {
			return null;
		}
		ListNode tmp = head;
		int count = 0;
		while (tmp != null) {
			tmp = tmp.next;
			count++;
		}
		k = k % count;
		
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		fast.next = head;
		ListNode result = slow.next;
		slow.next = null;
		
		return result;
	}

	public static void main(String[] args) {

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
