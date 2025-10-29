class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char,int> mp;
        mp['I'] = 1,mp['V'] = 5,mp['X'] = 10,mp['L'] = 50,mp['C'] = 100,mp['D'] = 500,mp['M'] = 1000;

        int n = s.size();
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i!=n-1 and mp[s[i]] < mp[s[i+1]]) sum -= mp[s[i]];
            else sum += mp[s[i]];
        }
        return sum;

    }
};