class Solution {
public:
    static long long maxRunTime(int n, vector<int>& batteries) {
        const long long sum = reduce(batteries.begin(), batteries.end(), 0LL);
        long long l = *min_element(batteries.begin(), batteries.end()),
                  r = sum / n, ans = 0;

        while (l <= r) {
            long long mid = (l + r) >> 1;
            long long reserve = 0;

            for (int x : batteries)
                reserve += min((long long)x, mid);

            if (reserve >= mid * n) {
                ans = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }
        return ans;
    }
};