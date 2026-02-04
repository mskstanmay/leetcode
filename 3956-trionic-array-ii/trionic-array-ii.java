class Solution {
    public long maxSumTrionic(int[] nums) {
        int n = nums.length;

        final long NINF = -(1L << 60);

        long a = NINF, b = NINF, c = NINF, result = NINF;
        for (int i = 1; i < n; ++i) {
            long x0 = nums[i - 1], x1 = nums[i];

            long na = NINF, nb = NINF, nc = NINF;
            if (x0 < x1) {
                na = Math.max(x0 + x1, (a == NINF) ? NINF : (a + x1));

                nc = Math.max((c == NINF) ? NINF : (c + x1), (b == NINF) ? NINF : (b + x1));

            } else if (x0 > x1) 
                nb = Math.max((b == NINF) ? NINF : (b + x1), (a == NINF) ? NINF : (a + x1));

            result = Math.max(result, nc);
            a = na; b = nb; c = nc;
        }

        return result;
    }
}