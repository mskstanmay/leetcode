class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char,int> st;
        st['I'] = 1 ;
        st['V'] = 5 ;
        st['X'] = 10 ; 
        st['L'] = 50 ; 
        st['C'] = 100; 
        st['D'] = 500; 
        st['M'] = 1000;

        int res = 0;
        for(int i=0;i<s.size();i++){
            if(st[s[i]] < st[s[i+1]]){
                res -= st[s[i]];
            }
            else
                res += st[s[i]];
        }
        return res ;
    }
};