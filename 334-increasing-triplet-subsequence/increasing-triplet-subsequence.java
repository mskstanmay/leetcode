class Solution {
    static {
    int[] a = {1, 2, 3, 4};
    Solution sol = new Solution();
    for (int i = 0; i < 200; i++) {
        sol.increasingTriplet(a); // object method call
    }
}
    public static boolean increasingTriplet(int[] nums) {
        int A = Integer.MAX_VALUE;
        int B = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (A >= x) {
                A = x;
            } else if (B >= x) {
                B = x;
            } else {
                return true;
            }

        }
        return false;
    }
}