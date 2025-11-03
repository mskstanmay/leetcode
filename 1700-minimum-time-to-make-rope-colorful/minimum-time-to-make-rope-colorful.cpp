class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int res = 0;
        int base = neededTime[0];

        for (int i = 1; i < colors.length(); i++) {
            if (colors[i] == colors[i - 1]) {
                res += min(base, neededTime[i]);
                base = max(base, neededTime[i]);
            } else {
                base = neededTime[i];
            }
        }

        return res;
    }
};