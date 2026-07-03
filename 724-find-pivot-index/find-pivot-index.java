class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int Rsum = 0;
        for (int i = 0; i < n; i++)
            Rsum += nums[i];
        int Lsum = 0;
        for (int i = 0; i < n; i++) {
           Rsum-=nums[i];
            if(Lsum==Rsum) return i;
            Lsum+=nums[i];
            
        }
        return -1;
    }
}