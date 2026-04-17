class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int start, int stop) {
        if (start > stop)
            return -1;

        int mid = start + (stop - start) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, stop);
        } else {
            return binarySearch(nums, target, start, mid - 1);
        }
    }
}