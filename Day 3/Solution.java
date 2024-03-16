class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int lpdt = 1;
        for (int i = 0; i < len; i++) {
            res[i] = lpdt;
            lpdt *= nums[i];
        }
        int rpdt = 1;
        for (int i = len - 1; i >= 0; i--) {
            res[i] *= rpdt;
            rpdt *= nums[i];
        }
        return res;
    }
}