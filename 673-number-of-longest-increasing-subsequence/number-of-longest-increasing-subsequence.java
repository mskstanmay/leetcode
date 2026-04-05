class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        int counts[] = new int[n];
        
        Arrays.fill(dp, 1);
        Arrays.fill(counts, 1);

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[i] + 1;
                        counts[i] = counts[j];
                    }
                    else if (dp[j] + 1 == dp[i]){
                        counts[i] += counts[j];
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }
        int c = 0;
        for (int i= 0;i<n;i++) {
            if (dp[i] == max)
                c+= counts[i];
        }
        return c;

    }
}
