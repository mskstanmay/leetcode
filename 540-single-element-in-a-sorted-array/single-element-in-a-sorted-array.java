class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] != nums[m - 1] && nums[m] != nums[m + 1])
                return nums[m];
            else if ((m & 1) == 1) {
                if (nums[m] == nums[m - 1]) {
                    i = m + 1;
                } else {
                    j = m - 1;
                }
            } else {
                if (nums[m] == nums[m + 1]) {
                    i = m + 1;
                } else {
                    j = m - 1;
                }
            }

        }
        return -1;
    }
}