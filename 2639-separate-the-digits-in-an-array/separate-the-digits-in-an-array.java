class Solution {
    
    public int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i= nums.length  - 1; i >=0; i -- ){
            int v = nums[i];
            while(v >0){
                res.add(v%10);
                v/=10;
            }
        }
        Collections.reverse(res);

         int[] q = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            q[i] = res.get(i);
        }
        return q;
        //return res.stream().mapToInt(Integer::intValue).toArray();
    }
}