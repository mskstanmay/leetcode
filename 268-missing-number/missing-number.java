class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int es = ((n)*(n+1))/2;
        for(int i = 0; i<n;i++){
            es-=nums[i];
        }
        return es;
    }
}