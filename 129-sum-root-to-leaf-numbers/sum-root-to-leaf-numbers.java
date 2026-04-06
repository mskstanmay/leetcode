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
    public boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
    public int helpME(TreeNode root, int CURRENT) {
        if (root == null)
            return 0;
        CURRENT = root.val +  CURRENT * 10 ;
        if(isLeaf(root))  return CURRENT;
        return helpME(root.left, CURRENT) + helpME(root.right, CURRENT);

    }

    public int sumNumbers(TreeNode root) {
        return helpME(root, 0);
    }

}