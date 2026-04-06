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
    public int helpME(TreeNode root, int CURRENT) {
        if (root == null)
            return 0;
        CURRENT = root.val + CURRENT * 10;
        if (root.left == null && root.right == null)
            return CURRENT;
        return helpME(root.left, CURRENT) + helpME(root.right, CURRENT);

    }

    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        return helpME(root, 0);
    }

}