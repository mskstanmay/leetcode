/*
0: Unoccupied & NOT Guarded
1: Occupied & Wall
2: Occupied & guard
3: Unoccupied & Guarded
*/

class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        int[][] matrix = new int[m][n];

        for (int[] wall : walls)
            matrix[wall[0]][wall[1]] = 1;

        for (int[] guard : guards)
            matrix[guard[0]][guard[1]] = 2;

        int[][] directionPointers = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int[] guard : guards) {
            for (int[] direction : directionPointers) {
                int x = guard[0] + direction[0]; // Moving in directions
                int y = guard[1] + direction[1]; // Moving in directions
                while (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] != 1 && matrix[x][y] != 2) {
                    /* Conditions used :
                    1)X is positive and in bounds
                    2)Y is positive and in bounds
                    3)Value isn't 1 or 2 i.e wall/guard
                    */
                    if (matrix[x][y] == 0)
                        matrix[x][y] = 3;
                    x += direction[0];
                    y += direction[1];
                }
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (matrix[i][j] == 0)
                    count++;

        return count;
    }
}
