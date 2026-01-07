class Solution {
    long maxP = 0;
    long total = 0;
    static final int MOD = 1_000_000_007;

    public long totalSum(TreeNode root) {
        if (root == null)
            return 0;

        long left = totalSum(root.left);
        long right = totalSum(root.right);

        return root.val + left + right;
    }

    public long find(TreeNode root) {
        if (root == null)
            return 0;

        long left = find(root.left);
        long right = find(root.right);

        long subTreeSum = root.val + left + right;

        long product = subTreeSum * (total - subTreeSum);
        maxP = Math.max(maxP, product);

        return subTreeSum;
    }

    public int maxProduct(TreeNode root) {
        total = totalSum(root);
        find(root);
        return (int) (maxP % MOD);
    }
}