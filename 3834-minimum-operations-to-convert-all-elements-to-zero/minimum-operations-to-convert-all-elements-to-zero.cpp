class Solution {
public:
    int minOperations(vector<int>& nums) {
    int n = nums.size();
    set<int> S;
    for (int x : nums)
        if (x > 0)
            S.insert(x);
    vector<int> uniq(S.begin(), S.end());
    
    int ans = 0;
    stack<int> st;
    st.push(0);
    for (int num : nums) {
        while (!st.empty() && st.top() > num) {
            st.pop();
        }
        if (st.empty() || st.top() < num) {
            if (num > 0) {
                ++ans;
            }
            st.push(num);
        }
    }
    return ans;
}
};