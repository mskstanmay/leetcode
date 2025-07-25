class Solution {

    public void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }

    public void sortColors(int[] nums) {
        // 0 = red , 1 = white , 2 = blue
        int l = 0;
        int m = 0;
        int h = nums.length - 1;

        while (m <= h) {
            if (nums[m] == 0) {
                swap(nums, l, m);
                l++;
                m++;

            } else if (nums[m] == 1) {
                m++;
            } else {
                swap(nums, h, m);
                h--;
            }
        }
    }
}