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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null)
            return ans;
        dfs(root, new StringBuilder(), ans);
        return ans;
    }

    private void dfs(TreeNode node, StringBuilder path, List<String> ans) {
        if (node == null)
            return;

        int len = path.length();
        if (path.length() > 0) {
            path.append("->");
        }
        path.append(node.val);

        if (node.left == null && node.right == null) {

            ans.add(path.toString());
        } else {
            dfs(node.left, path, ans);
            dfs(node.right, path, ans);
        }

        path.setLength(len);
    }
}
