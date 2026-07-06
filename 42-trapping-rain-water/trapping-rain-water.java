class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int lmax = 0, rmax = 0, res = 0;

        while (i < j) {
            lmax = Math.max(lmax, height[i]);
            rmax = Math.max(rmax, height[j]);

            if (lmax < rmax) {
                res += (lmax - height[i]);
                i++;
            } else {
                res += (rmax - height[j]);
                j--;
            }
        }
        return res;
    }
}