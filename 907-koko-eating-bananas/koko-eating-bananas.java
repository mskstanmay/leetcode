class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int x : piles) {
            max = Math.max(max, x);
        }
        int low = 1;
        int high = max;
        int ans = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean canFinish(int[] piles, int k, int h) {
        long hrs = 0;
        for (int pile : piles) {
            hrs += (pile + k - 1) / k;
        }
        return hrs <= h;
    }
}