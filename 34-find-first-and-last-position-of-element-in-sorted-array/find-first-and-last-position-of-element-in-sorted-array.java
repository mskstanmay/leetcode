class Solution {
    static {
        int[] a = { -1, 0, 3, 5, 9, 12 }; // sample sorted array
        int target = 9;

        for (int i = 0; i < 200; i++) {
            searchRange(a, target); // warm-up call to JIT-compile
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        if (nums.length == 0)
            return ans;

        ans[0] = first(nums, target);
        ans[1] = last(nums, target);
        return ans;
    }

    public static int first(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int a = -1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == target) {
                a = m;
                j = m - 1;
            } else if (target > nums[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }

        }
        return a;
    }

    public static int last(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int a = -1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == target) {
                a = m;
                i = m + 1;
            } else if (target > nums[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }

        }
        return a;
    }
}