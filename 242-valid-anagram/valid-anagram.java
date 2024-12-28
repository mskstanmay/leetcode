class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> w1 = wordhasher(s);
        HashMap <Character, Integer> w2 = wordhasher(t);

        return w1.equals(w2);
    }

    public static HashMap <Character, Integer> wordhasher(String s){
        HashMap <Character, Integer> entries = new HashMap<>();
        for(char letter : s.toCharArray()){
             entries.put(letter, entries.getOrDefault(letter, 0) + 1);
            }
        return entries;
    }
}