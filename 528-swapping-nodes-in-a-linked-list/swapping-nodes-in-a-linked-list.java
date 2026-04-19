class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        ListNode second = head;
        for (int i = 1; i <= length - k; i++) {
            second = second.next;
        }

        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;

        return head;
    }
}