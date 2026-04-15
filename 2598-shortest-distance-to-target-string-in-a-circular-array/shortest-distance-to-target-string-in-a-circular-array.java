class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        for (int i = 0; i <= n >> 1; i++) {
            if (words[(startIndex + i) % n].equals(target) | words[(startIndex - i + n) % n].equals(target))
                return i;
        }
        return -1;
    }
}