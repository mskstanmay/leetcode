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
    public ListNode reverseSLL(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public ListNode doubleIt(ListNode head) {
        ListNode newhead = reverseSLL(head);

        ListNode dummy = new ListNode(-1);

        ListNode ans = dummy;

        int c = 0;
        while (newhead != null) {
            int s = newhead.val + newhead.val + c;

            int d = s % 10;
            c = s / 10;

            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;
            newhead = newhead.next;
        }
        if (c > 0) {
            ListNode temp = new ListNode(c);
            dummy.next = temp;

        }
        ans = reverseSLL(ans.next);
        return ans;
    }
}