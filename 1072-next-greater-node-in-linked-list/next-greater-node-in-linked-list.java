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
    /*Approach 1 : 
    public int sizeLL(ListNode head) {
        ListNode current = head;
        int c = 0;
        while (current != null) {
            c++;
            current = current.next;
        }
        return c;
    }

    public ListNode reverseLL(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public int[] nextLargerNodes(ListNode head) {
        int size = sizeLL(head);

        int[] arr = new int[size];
        ListNode rHead = reverseLL(head);

        Stack<Integer> st = new Stack<>();
        st.push(rHead.val);

        ListNode curr = rHead.next;
        int ptr = size - 2;

        while (ptr >= 0) {
            int element = curr.val;
            curr = curr.next;

            while (st.size() > 0 && st.peek() <= element) {
                st.pop();
            }

            if (st.size() == 0) {
                arr[ptr] = 0;
            } else {
                arr[ptr] = st.peek();
            }

            st.push(element);
            ptr--;
        }
        return arr;
        }*/
    
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st =  new Stack<>();
        ListNode temp = head;
        int l = 0;
        while(temp!=null){
            temp = temp.next;
            l++;
        }

        temp = head;
        int[] arr = new int[l];
        int[] ans = new int[l];

        for(int i = 0;temp!=null;i++){
            arr[i] = temp.val;
            temp=temp.next;
        }
        for(int i  = 0; i < l; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }
        return ans;
    }
}