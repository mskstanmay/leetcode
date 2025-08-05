class Solution {
    public int diagonalSum(int[][] mat) {
        // 00 11 22  i = j 
        // i+j = max length so 0 + max , 1+ max-1 so on except  max/2 & max/2
        int res = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    res += mat[i][j];
                }
            }
        }
        return res;
    }
}