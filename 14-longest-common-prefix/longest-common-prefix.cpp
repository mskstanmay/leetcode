class Solution {
public:
    string longestCommonPrefix(vector<string>& input_string) {
        if (input_string.empty())
            return ""; // Empty Input

        string pref = input_string[0]; // First word
        int prefLen = pref.length();   // Length of first word

        for (int i = 1; i < input_string.size(); i++) { // iterate through words
            string s = input_string[i];                 // Get the word
            while (prefLen > s.length() ||
                   pref != s.substr(0, prefLen)) { // If word 1 to i is smaller
                // than second or first word is not wholly contained in second
                // from the start-Prefix
                prefLen--; // since first word full not there, reduce length of
                           // it by 1
                if (prefLen == 0) { // if length ends up , Match failed, return
                                    // blank string
                    return "";
                }
                pref = pref.substr(
                    0, prefLen); // If we've reached a situation where len != 0
                // Prefix word is the new matched thing and now we compare again
            }
        }

        return pref;
    }
};