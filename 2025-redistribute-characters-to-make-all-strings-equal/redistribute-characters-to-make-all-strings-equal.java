class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            for (int j = 0; j < w.length(); j++) {
                char ch = w.charAt(j);
                int idx = (int) (ch - 'a');

                freq[idx] = freq[idx] + 1;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}