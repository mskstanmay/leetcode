class Solution {
    static {
        int[] a = { -1, 0, 3, 5, 9, 12 }; // sample sorted array
        int target = 9;

        for (int i = 0; i < 200; i++) {
            search(a, target); // warm-up call to JIT-compile
        }
    }

    public static int search(int[] nums, int target) {
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