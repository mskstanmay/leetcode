class Solution {
    private ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;

            curr.next = prev;

            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

    public ListNode removeNodes(ListNode head) {
        ListNode rev = reverseLL(head);

        ListNode curr = rev;
        int max = curr.val;

        while (curr != null && curr.next != null) {
            if (curr.next.val < max)
                curr.next = curr.next.next;
            else {
                max = curr.next.val;
                curr = curr.next;
            }
        }
        return reverseLL(rev);
    }
}