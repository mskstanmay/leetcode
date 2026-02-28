class Solution {
    public int concatenatedBinary(int n) {
        final int modulus = 1_000_000_007;
        int bits = 0;
        long res = 0;

        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0)
                bits++;
            res = ((res << bits) | i) % modulus;

        }
        return (int) res;
    }
}