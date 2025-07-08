class Solution {
    public boolean increasingTriplet(int[] nums) {
        int A = Integer.MAX_VALUE;
        int B = Integer.MAX_VALUE;
        int C = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (A >= x) {
                A = x;
            } else if (B >= x) {
                B = x;
            } else {
                C = x;
                return true;
            }

        }
        return false;
    }
}