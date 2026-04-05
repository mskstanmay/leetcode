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
        
        */

        /*
        Approach 2: Using 2 pointers lmax,rmax
            - Take min of lmax,rmax and iterate 
            - when u get new max update other pointer
            - for each index subtract max from height[i];
        
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
        */
       int n = height.length;
       int i  = 0,j = n-1;
       int lmax = 0, rmax = 0;
       int res = 0;
       
       while(i<j){
            lmax = Math.max(lmax,height[i]);
            rmax = Math.max(rmax,height[j]);

            if(lmax < rmax){
                res+=(lmax- height[i]);
                i++;
            } 
            else {
                res+=(rmax - height[j]);
                j--;
            }
       }
       return res;
    }

}