/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int size_ll(ListNode head){
        int size = 1;
        while(head.next !=null){
            head = head.next;
            size++;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA == null || headB == null) return null;

        int s1 = size_ll(headA);
        int s2 = size_ll(headB);

        int diff = s1-s2;

        ListNode p1 = headA;
        ListNode p2 = headB;
        if(diff > 0){
            while(diff > 0){
                p1 = p1.next;
                diff--;
            }
        } else if (diff < 0){
            while(diff < 0){
                p2 = p2.next;
                diff++;
            }
        } 
        
        while(p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }

return p1;
    }
}