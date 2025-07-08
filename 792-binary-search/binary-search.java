class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == target) {
                return m;
            } else if (target > nums[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }

        }
        return -1;
    }
}