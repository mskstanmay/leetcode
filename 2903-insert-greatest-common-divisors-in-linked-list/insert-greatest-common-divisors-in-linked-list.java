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
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        int g = temp.val;
        while (temp.next != null) {
            g = temp.val;
            ListNode n = new ListNode(gcd(g, temp.next.val));
            n.next = temp.next;
            temp.next = n;
            temp = n.next;
        }
        return head;
    }
}