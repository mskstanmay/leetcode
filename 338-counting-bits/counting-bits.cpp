using namespace std;
class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> arr(n + 1);
        for (int i = 0; i <= n; i++) {
            int cur = i, count = 0;
            while (cur != 0) {
                cur = cur & (cur - 1);
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }
};
