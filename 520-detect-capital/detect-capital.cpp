class Solution {
public:
    bool detectCapitalUse(string word) {
        if(word.size() == 1) return true;
        int n;
        bool first = false, capital = false, lower = false;
        n = word[0];
        if(n >= 65 && n <= 90) first = true;
        for(int i = 0; i < word.size(); i++){
            if(first == true && i == 0){
                continue;
            }
            n = word[i];
            if(n >= 65 && n <= 90) capital = true;
            else{
                lower = true;
            }
        }
        if(first == true && lower == true && capital == false) return true;
        if(capital == true && lower == false) return true;
        if(lower == true && capital == false && first == false)return true;
        else return false;
    }
};