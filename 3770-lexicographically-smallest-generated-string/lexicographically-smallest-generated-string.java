class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        char[] res = new char[n + m - 1];
        boolean[] locked = new boolean[n + m - 1];
        for (int i = 0; i < res.length; i++)
            res[i] = 'a';
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    int pos = i + j;
                    if (locked[pos] && res[pos] != str2.charAt(j))
                        return "";
                    res[pos] = str2.charAt(j);
                    locked[pos] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {
                boolean diff = false;
                for (int j = 0; j < m; j++) {
                    if (res[i + j] != str2.charAt(j)) {
                        diff = true;
                        break;
                    }
                }
                if (diff)
                    continue;
                boolean changed = false;
                for (int j = m - 1; j >= 0; j--) {
                    int pos = i + j;
                    if (!locked[pos]) {
                        res[pos] = 'b';
                        changed = true;
                        break;
                    }
                }
                if (!changed)
                    return "";
            }
        }
        return new String(res);
    }
}