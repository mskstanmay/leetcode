class Solution {
    // Approach : Recursion
    public int longestCommonSubsequence(String s1, String s2) {
       // return lcs(s1, s2, 0, 0);
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i = 1; i <= m ; i ++){
            for(int j = 1; j <= n ; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m][n];

    }

    // private int lcs(String s1, String s2, int i, int j) {
    //     if (i == s1.length() || j == s2.length()) {
    //         return 0;
    //     }
    //     if (s1.charAt(i) == s2.charAt(j)) {
    //         return 1 + lcs(s1, s2, i + 1, j + 1);
    //     } else {
    //         return Math.max(
    //                 lcs(s1, s2, i + 1, j),
    //                 lcs(s1, s2, i, j + 1));
    //     }
    // }
}