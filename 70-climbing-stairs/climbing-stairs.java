class Solution {
    public int climbStairs(int n) {
        int x = 1;
        int y = 1;

        for (int i = 0; i < n-1; i++) {
            int temp = x;
            x = x+y;
            y = temp;
        }
        return x;
    }
}