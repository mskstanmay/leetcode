class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeInBetween(self, list1: ListNode, a: int, b: int, list2: ListNode) -> ListNode:
        def get_node(head, i):
            curr = head
            for _ in range(i):
                curr = curr.next
            return curr
        
        def get_last_node(head):
            curr = head
            while curr.next:
                curr = curr.next
            return curr
        
        prev_a = get_node(list1, a - 1)
        bth_node = get_node(list1, b)
        
        last_list2 = get_last_node(list2)
        
        prev_a.next = list2
        
        last_list2.next = bth_node.next
        
        return list1

def create_linked_list(arr):
    dummy = ListNode(0)
    curr = dummy
    for val in arr:
        curr.next = ListNode(val)
        curr = curr.next
    return dummy.next

def print_linked_list(head):
    curr = head
    while curr:
        print(curr.val, end=" -> ")
        curr = curr.next
    print("None")
