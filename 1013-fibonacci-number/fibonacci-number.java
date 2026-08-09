class Solution {

    public int help(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return help(n-1) + help(n-2);
    }
    public int fib(int n) {
        return help(n);
    }
}