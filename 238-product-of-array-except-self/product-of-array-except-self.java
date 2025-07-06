class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] r = new int[n];
        int[] ans = new int[n];
        int l = 1;
        int p = 1;

        for (int i = n - 1; i >= 0; i--) {
            p *= nums[i];
            r[i] = p;
        }
        for (int i = 0; i < n - 1; i++) {
            ans[i] = l * r[i + 1];
            l *= nums[i];
        }
        ans[n - 1] = l;
        return ans;
    }
}