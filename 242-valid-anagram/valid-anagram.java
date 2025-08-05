class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hashmap = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(hashmap.containsKey(ch) == true){
                hashmap.put(ch,hashmap.get(ch)+1);
            }else {
                hashmap.put(ch,1);
            }
        }
        for(int i = 0 ; i<t.length(); i++){
            char ch = t.charAt(i);
            if(hashmap.containsKey(ch) == true){
               if  (hashmap.get(ch) ==1 ){
                hashmap.remove(ch);
               } else {
                hashmap.put(ch,hashmap.get(ch) - 1);
               }
            } else{
                return false;
            }
            
                
        }
        return hashmap.size() == 0;
    }
}