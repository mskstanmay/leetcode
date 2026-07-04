class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n + 1];
        for (int[] booking : bookings) {
            int first = booking[0] - 1;
            int last = booking[1];
            int qty = booking[2];

            res[first] += qty;
            if (last < n) {
                res[last] -= qty;
            }
        }
        int[] ans = new int[n];
        int current = 0;
        for (int i = 0; i < n; i++) {
            current += res[i];
            ans[i] = current;
        }

        return ans;

    }
}