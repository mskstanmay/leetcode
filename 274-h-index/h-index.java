class Solution {
    public int hIndex(int[] arr) {
      int n = arr.length;
      int[] store = new int[n+1];

      for(int x : arr){
        store[Math.min(x,n)]++; //Caps the value to N 
      }  

      int cP = 0;
      for(int i = n;i>=0;i--){
        cP = cP + store[i];
        if(cP >=i) return i;
      }
      return 0;
    }
}