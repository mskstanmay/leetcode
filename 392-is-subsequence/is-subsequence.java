import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int[][] nxt = new int[n + 1][26];
        
        Arrays.fill(nxt[n], -1);

        for (int i = n - 1; i >= 0; i--) {
            System.arraycopy(nxt[i + 1], 0, nxt[i], 0, 26); // Make Ith elemetn the same as I+1 Th element
            nxt[i][t.charAt(i) - 'a'] = i + 1; // Update the entry for the character at the current pos
        }

        int curr = 0;
        for (char c : s.toCharArray()) {
            int charIdx = c - 'a';
            if (nxt[curr][charIdx] == -1) {
                return false;
            }
            curr = nxt[curr][charIdx];
        }
        
        return true;
    }
}