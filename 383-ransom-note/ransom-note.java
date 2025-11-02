class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int check[] = new int [26];
        for(char c : ransomNote.toCharArray()){
            int i = magazine.indexOf(c, check[c-'a']);
            if(i==-1){
                return false;
            }
            check[c-'a'] = i+1;
        }
        return true;
    }
}