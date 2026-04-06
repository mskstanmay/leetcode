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
        // Use a standard Min-Heap (no reverseOrder) to keep the k largest sums.
        // The smallest of the top k will stay at the top (peek).
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
            
            // If we have more than k sums, discard the smallest one
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Standard check: if the tree height is less than k
        if (levelsCount < k) {
            return -1;
        }

        return pq.peek();
    }
}