class Solution {
    public int climbStairs(int n, int[] costs) {

        int[] dp = new int[n+1];
       

        dp[0] = 0;
        if( n >= 1){
        dp[1] = costs[0] + 1;
        if (n >= 2) {

        dp[2] = Math.min((costs[1] + 4), (dp[1] + costs[1] + 1));
        if (n >= 3) {

        dp[3] = Math.min(Math.min((costs[2] + 9), (dp[2] + costs[2] + 1)), costs[2] + dp[1] + 4);
       

        for (int i = 4; i <=n; i++) {
            dp[i] = Math.min(
                    dp[i - 1] + costs[i - 1] + 1,
                    (Math.min(dp[i - 2] + costs[i - 1] + 4, dp[i - 3] + costs[i - 1] + 9)));
        }
        }}}
        return dp[n];
    }

}