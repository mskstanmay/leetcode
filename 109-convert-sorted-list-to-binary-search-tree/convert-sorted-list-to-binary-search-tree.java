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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null) return new TreeNode(head.val);
        return buildTree(head);
    }

    public TreeNode buildTree(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode s, f, prev = null;
        s = f = head;

        while (f != null && f.next != null) {
            prev = s;
            s = s.next;
            f = f.next.next;
        }

        TreeNode root = new TreeNode(s.val);
        if(prev!=null) {
            prev.next = null;
        }
        root.left = buildTree(head);
        root.right = buildTree(s.next);

        return root;
    }
}