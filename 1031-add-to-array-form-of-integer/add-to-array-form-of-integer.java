class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans  = new ArrayList<>();
        int l = num.length-1;
        int c=0;

        while(l>=0 || k> 0){
            int nv = 0;
            if(l>=0){
                nv = num[l];
            }

            int d = k%10;
            int s = nv+d+c;
            int dig = s%10;
            c = s/10;
            ans.add(dig);
            l--;
            k/=10; 
        }
        if(c > 0){
            ans.add(c);
        }

        Collections.reverse(ans);
        return ans;
    }
}