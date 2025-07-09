class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        if (j == 0 || (nums[0] < nums[j]))
            return nums[0];

        while (i <= j) {
            int m = (i + j) / 2;
            if (m != 0 && nums[m - 1] > nums[m]) {
                return nums[m];
            } else if (m != nums.length - 1 && nums[m] > nums[m + 1]) {
                return nums[m + 1];
            } else if (nums[i] <= nums[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }

        }
        return -1;
    }
}