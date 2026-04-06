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
    public int maxDepth(TreeNode root) {
         if (root == null)
            return 0;
        int lval = 0, rval = 0;
        if (root.left != null)
            lval = maxDepth(root.left);
        if (root.right != null)
            rval = maxDepth(root.right);

        return 1 + Math.max(lval, rval);
    }
}