class Solution {
    public int bulbSwitch(int n) {
      int  c = 0;
    int i = 1;
    while(i*i<=n){
        c++;
        i++;
    }
    return c;
      
    }
}