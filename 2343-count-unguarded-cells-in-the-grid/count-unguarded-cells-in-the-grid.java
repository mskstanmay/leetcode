import java.util.*;

class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        // Create BitSets for each row to track walls, guards, and guarded cells
        BitSet[] wall = new BitSet[m];
        BitSet[] guard = new BitSet[m];
        BitSet[] guarded = new BitSet[m];
        for (int i = 0; i < m; i++) {
            wall[i] = new BitSet(n);
            guard[i] = new BitSet(n);
            guarded[i] = new BitSet(n);
        }

        // Mark walls and guards
        for (int[] w : walls)
            wall[w[0]].set(w[1]);

        for (int[] g : guards)
            guard[g[0]].set(g[1]);

        // Directions: up, down, left, right
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        // Mark guarded cells
        for (int[] g : guards) {
            int gx = g[0], gy = g[1];
            for (int[] d : dirs) {
                int x = gx + d[0];
                int y = gy + d[1];
                // Keep moving until wall or another guard blocks view
                while (x >= 0 && x < m && y >= 0 && y < n 
                        && !wall[x].get(y) && !guard[x].get(y)) {
                    guarded[x].set(y);
                    x += d[0];
                    y += d[1];
                }
            }
        }

        // Count unguarded cells efficiently
        int unguarded = 0;
        for (int i = 0; i < m; i++) {
            // Combine wall + guard + guarded into one BitSet
            BitSet occupied = (BitSet) wall[i].clone();
            occupied.or(guard[i]);
            occupied.or(guarded[i]);
            // unguarded cells = total - occupied
            unguarded += n - occupied.cardinality();
        }

        return unguarded;
    }
}
