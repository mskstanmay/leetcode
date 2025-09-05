/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode left;

    public void reorderList(ListNode head) {
        left = head;
        helper(head);
    }

    private  void helper(ListNode right) {
        if (right == null)
            return;
        helper(right.next);

        if (left == null)
            return;
        if (left == right || left.next == right) {
            right.next = null;
            left = null;
            return;

        }

        ListNode temp = left.next;
        left.next = right;
        right.next = temp;

        left = temp;
    }
}