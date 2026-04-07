class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            if (vowels.indexOf(chars[i]) != -1 && vowels.indexOf(chars[j]) != -1) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
        i++;
        j--;
            } else if (vowels.indexOf(chars[i]) != -1) {
                j--;
            } else {
                i++;
            }
        }
        return new String(chars);
    }
}