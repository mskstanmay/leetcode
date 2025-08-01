class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> store = new HashMap<>(); 
        
        for(int i : nums){
            store.put(i,false);
        }
        for(int key : store.keySet()){
            if(store.containsKey(key-1) == false){
                store.put(key,true);
            }
        }
        int max = 0;
        for(int key: store.keySet()){
            int k = 1;
            if(store.get(key) == true){
                while(store.containsKey(key+k) == true){
                    k++;
                }
            }
            max = Math.max(max,k);
        }
        return max;
    }
}