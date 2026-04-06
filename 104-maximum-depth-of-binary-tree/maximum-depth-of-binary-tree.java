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

        /* Approach 1: Iterative
        */
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        
        /*Approach 2: Level Order
        

        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return 0;
        q.offer(root);
        int lvl = 0;
        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                TreeNode current = q.poll();
                if (current.left != null)
                    q.add(current.left);
                if (current.right != null)
                    q.add(current.right);
            }
            lvl++;
        }
        return lvl;
*/
    }
}