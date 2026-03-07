class Solution {
    public int maxRepeating(String sequence, String word) {
        int c = 0;
        String temp = word;
        while (sequence.contains(temp)) {
            c++;
            temp += word;
        }
        return c;
    }
}