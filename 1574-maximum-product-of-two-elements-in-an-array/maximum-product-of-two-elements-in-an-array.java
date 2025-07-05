class Solution {
    public int maxProduct(int[] nums) {
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (f < nums[i]) {
                s = f;
                f = nums[i];
            } else if (s < nums[i]) {
                s = nums[i];
            }
        }
        int ans = (f - 1) * (s - 1);
        return ans;
    }
}