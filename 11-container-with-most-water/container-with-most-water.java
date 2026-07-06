class Solution {
    public int maxArea(int[] height) {
        int res  = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j){
            int t = Math.min(height[i], height[j]) * (j-i);
            res = Math.max(res,t);
        
            if(height[i] < height[j]) i++;
            else j--;
        }
        return res;
    }
}