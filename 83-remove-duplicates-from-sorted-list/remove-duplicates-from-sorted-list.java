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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode d = new ListNode(head.val);
        ListNode ans = d;

        ListNode ptr = head.next;

        while (ptr != null) {
            if (ptr.val != d.val) {
                ListNode temp = new ListNode(ptr.val);
                d.next = temp;
                d = d.next;
            }
            ptr = ptr.next;
        }
        return ans;
    }
}