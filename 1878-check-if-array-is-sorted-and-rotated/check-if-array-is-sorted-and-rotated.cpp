class Solution {
public:
    bool check(vector<int>& arr) {
        int n = arr.size();
        int countDecrease = 0;

        for (int i = 0; i < n; i++) {
            // Check if current element is greater than the next (circularly)
            if (arr[i] > arr[(i + 1) % n]) {
                countDecrease++;
                if (countDecrease > 1) return false; // More than 1 decrease is invalid
            }
        }

        // Valid if there are 0 or 1 decreases
        return true; 
    }
};
