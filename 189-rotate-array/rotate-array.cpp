#include <algorithm> // For std::reverse

class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k = k % n; // Handle cases where k > n

        // Reverse the entire array
        reverse(nums.begin(), nums.end());

        // Reverse the first k elements
        reverse(nums.begin(), nums.begin() + k);

        // Reverse the remaining elements
        reverse(nums.begin() + k, nums.end());
    }
};
