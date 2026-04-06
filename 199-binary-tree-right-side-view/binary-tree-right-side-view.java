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
    void levelOrderRec(TreeNode root, int level,
                       ArrayList<ArrayList<Integer>> res)
    {
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
        for(ArrayList<Integer> x : values){
            int s = x.size();
            res.add(x.get(s-1)); 
        }
        return res;
    }
}