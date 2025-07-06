class Solution {
    public int dominantIndex(int[] nums) {
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (l < nums[i]) {
                sl = l;
                l = nums[i];
                res = i;
            } else if (sl < nums[i]) {
                sl = nums[i];
            }
        }
        if (sl * 2 <= l) {
            return res;
        } else {
            return -1;
        }
    }
}