class Solution {
    public int fib(int n) {
        return nthFib(n+1, -1, 1);
    }
    
    private int nthFib(int n, int l1, int l2){
        if(n==0) return l2;
        else return nthFib(n-1, l2, l1+l2);
    }
}