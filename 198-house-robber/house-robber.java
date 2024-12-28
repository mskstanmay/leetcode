class Solution {
    public int rob(int[] nums) {

        // Edge cases
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        // Initial Conditions
        int prev2 = nums[0]; // F(X-2)
        int prev1 = Math.max(nums[0], nums[1]); // F(X-1)
        
        for (int i = 2; i < nums.length; i++) {
            int current = Math.max(prev2 + nums[i], prev1);
            prev2 = prev1; // Update (X-2)
            prev1 = current; // Update F(X-1)
        }

        return prev1; // The last value is the maximum amount that can be robbed
    }
}
