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
        /* Approach 1 : Using stack to push and pop all values;
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
        
        */
        if (head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode part2 = reverse(slow);
        ListNode part1 = head;

        while (part2 != null) {
            if (part1.val != part2.val)
                return false;
            part1 = part1.next;
            part2 = part2.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}