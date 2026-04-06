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
    /*
    Approach - Recursion
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        view(root, res, 0);
        return res;
    }
    
    public void view(TreeNode root, List<Integer> res, int l) {
        if (root == null)
            return;
        if (res.size() == l)
            res.add(root.val);
    
        view(root.right, res, l + 1);
        view(root.left, res, l + 1);
    }
    */

    /*
    Approach - Level Order
    
    CODE1 : Taking a queue and only using nodes where index = q.size() - 1 if not add children after poll.  
    */

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null)
            return res;
        q.offer(root);
        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                TreeNode current = q.poll();
                if (i == s - 1)
                    res.add(current.val);
                if (current.left != null)
                    q.offer(current.left);
                if (current.right != null)
                    q.offer(current.right);
            }
        }
        return res;
    }
    /*
    CODE2 : Doing full  Level order Traversal and taking last elements of each level
    
    void levelOrderRec(TreeNode root, int level,
        ArrayList<ArrayList<Integer>> res) {
        if (root == null)
            return;
    
        if (res.size() <= level)
            res.add(new ArrayList<>());
    
        res.get(level).add(root.val);
    
        levelOrderRec(root.left, level + 1, res);
        levelOrderRec(root.right, level + 1, res);
    }
    
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
    
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        levelOrderRec(root, 0, res);
        return res;
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> values = levelOrder(root);
        for (ArrayList<Integer> x : values) {
            int s = x.size();
            res.add(x.get(s - 1));
        }
        return res;
    }*/
}