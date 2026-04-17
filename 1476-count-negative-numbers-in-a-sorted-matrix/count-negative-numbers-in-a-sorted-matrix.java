class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        int n = grid.length;
        int i = 0;
        int j = grid[0].length - 1;
        while (i < n && j >= 0) {
            if (grid[i][j] >= 0) {
                i++;
            } else {
                res += n - i;
                j--;
            }
        }
        return res;

    }
}