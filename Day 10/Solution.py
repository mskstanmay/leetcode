# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        straight = ""
        while (True):
            straight = straight + str(head.val)
            if head.next is None:
                break
            head = head.next
        return (straight == straight[::-1])
        