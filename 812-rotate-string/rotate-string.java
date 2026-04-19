class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String nG = goal + goal;
        if(nG.contains(s)) return true;
        
        return false;
    }

}