class Solution {
    public int bS(int[] nums, int target) {
        int i = 0;
        int j = nums.length;
        while (i < j) {
            int m = (i + j) / 2;
            if (nums[m] < target) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        return i;
    }

    public int maximumCount(int[] nums) {
        int n = nums.length;

        int p = bS(nums, 1);
        int z = bS(nums, 0);
        
        return Math.max(z, n-p);
    }
}