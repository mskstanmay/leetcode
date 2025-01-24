#include <unordered_map>
#include <vector>
using namespace std;
class Solution {
public:
    int majorityElement(vector<int>& nums) {
    unordered_map<int, int> freqMap;

    int n = nums.size();
    for (int num : nums) {
        freqMap[num]++; // Count the occurrences of each element
    }

    for (const auto& pair : freqMap) {
        if (pair.second > n / 2) { // Check if the frequency exceeds n/2
            return pair.first; // Return the majority element
        }
    }

    return -1; // Return -1 if no majority element exists
}
};