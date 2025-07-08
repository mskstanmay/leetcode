class Solution {
    static {
        int[] a = { 1, 2, 3, 4 };
        for (int i = 0; i < 200; i++) {
            maxAscendingSum(a); // static method call
        }
    }

    public static int maxAscendingSum(int[] nums) {
        int m = nums[0];
        int l = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] < nums[i]) {
                l += nums[i];

            } else {
                m = Math.max(m, l);
                l = nums[i];
            }
        }
        m = Math.max(m, l);
        return m;
    }
}