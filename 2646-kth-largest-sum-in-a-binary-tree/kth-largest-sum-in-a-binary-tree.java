/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int levelsCount = 0;

        while (!q.isEmpty()) {
            int s = q.size();
            long lvlSum = 0;
            for (int i = 0; i < s; i++) {
                TreeNode current = q.poll();
                lvlSum += current.val;

                if (current.left != null)
                    q.offer(current.left);
                if (current.right != null)
                    q.offer(current.right);
            }
            
            levelsCount++;
            pq.offer(lvlSum);
            
            if (pq.size() > k) {
                pq.poll();
            }
        }

        if (levelsCount < k) {
            return -1;
        }

        return pq.peek();
    }
}