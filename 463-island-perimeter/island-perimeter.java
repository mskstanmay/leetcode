class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    // Start DFS as soon as we find any part of the single island
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int r, int c) {
        // If we go out of bounds or hit water, that's an edge (perimeter +1)
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 1;
        }
        
        // If we hit a cell we've already visited, it adds nothing to perimeter
        if (grid[r][c] == -1) {
            return 0;
        }

        // Mark the cell as visited
        grid[r][c] = -1;

        // Sum up perimeter from all 4 directions
        int perimeter = 0;
        perimeter += dfs(grid, r + 1, c);
        perimeter += dfs(grid, r - 1, c);
        perimeter += dfs(grid, r, c + 1);
        perimeter += dfs(grid, r, c - 1);

        return perimeter;
    }
}