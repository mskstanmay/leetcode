#include <vector>
using namespace std;

class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int index = 0; // Pointer to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        while (index < nums.size()) {
            nums[index++] = 0;
        }
    }
};
