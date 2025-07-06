class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1;
        int[] B = nums2;

        if (A.length > B.length) {
            return findMedianSortedArrays(B, A); // Always binary search on smaller array
        }

        int total = A.length + B.length;
        int half = total / 2;

        int l = 0;
        int r = A.length;

        while (true) {
            int i = (l + r) / 2;     // Partition index in A
            int j = half - i;        // Partition index in B

            int L1 = (i > 0) ? A[i - 1] : Integer.MIN_VALUE;
            int R1 = (i < A.length) ? A[i] : Integer.MAX_VALUE;

            int L2 = (j > 0) ? B[j - 1] : Integer.MIN_VALUE;
            int R2 = (j < B.length) ? B[j] : Integer.MAX_VALUE;

            if (L1 <= R2 && L2 <= R1) {
                if (total % 2 == 1) {
                    return Math.min(R1, R2);
                } else {
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                }
            } else if (L1 > R2) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
    }
}
