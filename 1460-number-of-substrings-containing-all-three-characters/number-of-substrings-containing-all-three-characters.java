class Solution {
    public int numberOfSubstrings(String s) {
        int[] last = { -1, -1, -1 };
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;

            if (last[0] != -1 && last[1] != -1 && last[2] != -1) {
                int minLastSeen = Math.min(last[0], Math.min(last[1], last[2]));
                count += minLastSeen + 1;
            }
        }

        return count;
    }
}