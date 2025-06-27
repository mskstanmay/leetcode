class Solution {
    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        int f = 0;
        int s = 1;
        int t = 1;
        
        for (int i = 1; i <= n; i++) {
            int res = f + s + t;
            f = s;
            s = t;
            t = res;
        }
        return f;
    }
}