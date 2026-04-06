
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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
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
            pq.add(lvlSum);
        }

        if (pq.size() < k)
            return -1;
        else {
            for (int i = 0; i < k - 1; i++) {
                pq.poll();
            }
            return pq.poll();
        }
    }
}