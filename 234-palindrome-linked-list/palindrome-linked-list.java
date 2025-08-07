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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> store = new Stack<>();

        ListNode start = head;
        while (start.next != null) {
            store.push(start.val);
            start = start.next;
        }

        while (head.next != null) {
            int next = store.pop();
            if (head.next.val != next) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}