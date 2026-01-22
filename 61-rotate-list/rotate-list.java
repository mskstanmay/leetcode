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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;
        int l = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            l++;
        }
        k = k % l;
        if (k == 0)
            return head;

        tail.next = head;
        int steps = l - k;
        ListNode nTail = tail;
        while (steps > 0) {
            nTail = nTail.next;
            steps--;
        }

        ListNode nHead = nTail.next;
        nTail.next = null;
        return nHead;
    }
}