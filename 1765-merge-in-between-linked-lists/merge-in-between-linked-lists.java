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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode previous = list1;
        for (int i = 0; i < a - 1; i++) {
            previous = previous.next;
        }

        ListNode nextNode = previous;
        for (int i = 0; i <= b - a + 1; i++) {
            nextNode = nextNode.next;
        }

        ListNode temp = list1;
        previous.next = list2;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nextNode;
        return list1;
    }
}