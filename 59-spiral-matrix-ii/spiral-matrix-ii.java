class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];

        int count = 1;

        int minR = 0;
        int minC = 0;
        int maxR = n - 1;
        int maxC = n - 1;

        while (count <= n * n) {
            for (int c = minC; c <= maxC; c++) {
                arr[minR][c] = count;
                count++;
            }

            for (int r = minR + 1; r <= maxR; r++) {
                arr[r][maxC] = count;
                count++;
            }

            for (int c = maxC - 1; c >= minC; c--) {
                arr[maxR][c] = count;
                count++;
            }
            for (int r = maxR - 1; r >= minR + 1; r--) {
                arr[r][minC] = count;
                count++;
            }
            minC++;
            minR++;
            maxC--;
            maxR--;
        }
        return arr;
    }
}