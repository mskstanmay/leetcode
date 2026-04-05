import java.util.*;
class Solution {
    public int trap(int[] height) {
        /*
        Approach 1: Using left side max rod array and right side max rod array
        Ex: [1,0,2,1,3,2,0,1];
        lmax = [1,1,2,2,3,3,3,3];
        rmax = [3,3,3,3,3,2,1,1];
        for every index:
            - take min of lmax and rmax at that point
            - min value - current height => Trapped water 
        */
        /*
        Approach 2: 
        */
        int n = height.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        
        lmax[0] = height[0];
        rmax[n-1] = height[n-1];
        for(int i = 1 ;i<height.length;i++){
            lmax[i] = Math.max(lmax[i-1], height[i]);
        }
        for(int i= n-2;i>=0;i--){
            rmax[i] = Math.max(height[i],rmax[i+1]);
        }
        int res = 0;
        for(int i = 0;i<n;i++){
            res+=(Math.min(lmax[i],rmax[i]) - height[i]);
        }
        return res;
    }

}