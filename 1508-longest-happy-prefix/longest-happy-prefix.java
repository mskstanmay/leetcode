class Solution {
    public String longestPrefix(String s) {
        /*
        Approach1 : two string builders
        
        int n = s.length();
        StringBuilder prefix = new StringBuilder("");
        StringBuilder suffix = new StringBuilder("");
        String res = "";
        for (int i = 0; i < n - 1; i++) {
            prefix.append(s.charAt(i));
            suffix.insert(0, s.charAt(n - 1 - i));
            if(prefix.compareTo(suffix) == 0) res = prefix.toString();
        }
        // if(prefix.compareTo(suffix) == 0) return prefix.toString();
        return res;
        */

        /*Approach 2: 
        */
        char c[] = s.toCharArray();
        int n = s.length();
        int i = 1;
        int max = 0;

        int dp[] = new int[n];

        while (i < n) {
            if (c[max] == c[i]) {
                max++;
                dp[i] = max;
                i++;
            } else {
                if (max > 0) {
                    max = dp[max - 1];
                } else {
                    dp[i] = 0;
                    i++;
                }
            }
        }
        return s.substring(0, dp[n - 1]);
    }
}