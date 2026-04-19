class Solution {
    public int searchInsert(int[] nums, int target) {
        return binary(nums, 0, nums.length - 1, target);
    }

    private int binary(int[] nums, int start, int stop, int target) {
        if (start > stop) {
            return start;
        }
        int mid = start + (stop - start) / 2;
        // if (start == stop && nums[start] != target) {
        //     if (nums[start] > target)
        //         return start;
        //     else
        //         return start + 1;
        // }
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binary(nums, mid + 1, stop, target);
        } else {
            return binary(nums, start, mid - 1, target);
        }
    }
}