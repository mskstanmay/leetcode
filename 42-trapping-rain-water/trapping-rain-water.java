class Solution {
    public int trap(int[] height) {
        int i = 0, j = height.length - 1;
        int lmax = 0, rmax = 0;
        int ans = 0;

        while(i<j){
            if(height[i] < height[j]){
                if(height[i] >= lmax){
                    lmax = height[i];
                }else {
                    ans += lmax - height[i];
                }
                i++;
            }else {
                if(height[j] >= rmax){
                    rmax = height[j];
                }else {
                    ans += rmax - height[j];
                }
                j--;
            }
        }
        return ans;
    }
}