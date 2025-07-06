class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int x = ans.length - 1;

        while (i <= j) {
            int fs = nums[i] * nums[i];
            int ss = nums[j] * nums[j];

            if (fs > ss) {
                ans[x] = fs;
                i++;
            } else {
                ans[x] = ss;
                j--;
            }
            x--;
        }
        return ans;
    }
}