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
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];

        Queue<TreeNode> q = new LinkedList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxf = 0;
        q.offer(root);

        while (!q.isEmpty()) {
           TreeNode current = q.poll();
                int count = hm.getOrDefault(current.val, 0) + 1;
                hm.put(current.val, count);
                maxf = Math.max(maxf, count);
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
          }

        List<Integer> modes = new ArrayList<>();
        for (int key : hm.keySet()) {
            if (hm.get(key) == maxf) {
                modes.add(key);
            }
        }

       int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        
        return result;
    }
}