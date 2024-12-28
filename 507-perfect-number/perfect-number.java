class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        if(num==1)
        return false;
        for(int i=2;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if((sum+1)==num)
        return true;
        else
        return false;
    }
}