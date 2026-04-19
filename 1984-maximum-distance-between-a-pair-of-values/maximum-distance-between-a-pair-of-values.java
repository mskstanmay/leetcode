class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxDist = 0;

        for (int j = 0; j < nums2.length; j++) {
            int i = findSmallestI(nums1, Math.min(j, nums1.length - 1), nums2[j]);

            if (i != -1) {
                maxDist = Math.max(maxDist, j - i);
            }
        }
        return maxDist;
    }

    private int findSmallestI(int[] nums1, int rightBound, int target) {
        int left = 0;
        int right = rightBound;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums1[mid] <= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
/* Approach 2 : Using 2 pointers and keeping track of maximum distance
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int maxDist = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                maxDist = Math.max(maxDist, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxDist;
    }
}

*/