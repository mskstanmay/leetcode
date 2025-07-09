class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1 || (nums[0] > nums[1] ))
            return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;

        int i = 1;
        int j = nums.length - 2;
        while (i <= j) {
            int m = (i + j) / 2;

            if (nums[m] > nums[m - 1] && nums[m] > nums[m + 1])
                return m;
                else if (nums[m] <  nums[m+1]){
                    i = m+1;
                }
                else j = m-1;
        }
        return -1 ;
    }
}