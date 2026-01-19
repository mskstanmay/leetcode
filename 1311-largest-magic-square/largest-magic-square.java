class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int smallerSide = Math.min(m, n);

        while (smallerSide > 0) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + smallerSide <= m && j + smallerSide <= n) {
                        if (isValid(grid, m, n, i, j, smallerSide))
                            return smallerSide;
                    }
                }
            }
            smallerSide--;
        }

        return 0;
    }

    private boolean isValid(int[][] grid, int m, int n, int i, int j, int smallerSide) {
        int sum = 0;

        // row checking 
        for (int x = i; x < i + smallerSide; x++) {
            int summ = 0;
            for (int y = j; y < j + smallerSide; y++) {
                summ += grid[x][y];
            }
            if (x == i)
                sum = summ;
            else if (sum != summ)
                return false;
        }

        // column checking
        for (int x = j; x < j + smallerSide; x++) {
            int summ = 0;
            for (int y = i; y < i + smallerSide; y++) {
                summ += grid[y][x];
            }
            if (sum != summ)
                return false;
        }

        // main diagonal
        int summ = 0;
        for (int k = 0; k < smallerSide; k++) {
            summ += grid[i + k][j + k];
        }
        if (sum != summ)
            return false;

        // reverse diagonal
        summ = 0;
        for (int k = 0; k < smallerSide; k++) {
            summ += grid[i + k][j + smallerSide - 1 - k];
        }
        if (sum != summ)
            return false;

        return true;
    }

}