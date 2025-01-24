#include <unordered_map>
#include <vector>
#include <algorithm>
using namespace std;
class Solution {
public:
 vector<int> majorityElement(vector<int>& nums) {
    unordered_map<int, int> fmap; // To store the frequency of elements
    vector<int> result;

    int n = nums.size();
    for (int num : nums) {
        fmap[num]++; // Count occurrences of each element
    }

    for (const auto& pair : fmap) {
        if (pair.second > n / 3) { // Check if the frequency exceeds n/3
            result.push_back(pair.first); // Add the element to the result
        }
    }

    sort(result.begin(), result.end()); // Sort the result in ascending order

    return result;
}
};