class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        if not head or not head.next:
            return

        slow = head
        fast = head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next

        
        second_half = slow.next
        slow.next = None

       
        prev = None
        current = second_half
        while current:
            next_node = current.next
            current.next = prev
            prev = current
            current = next_node
        second_half = prev

        
        first_half = head
        while second_half:
            temp1 = first_half.next
            first_half.next = second_half
            temp2 = second_half.next
            second_half.next = temp1
            first_half = temp1
            second_half = temp2
