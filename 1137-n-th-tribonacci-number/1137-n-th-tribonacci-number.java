class Solution {
    int ans = 0;
    public int tribonacci(int n) {
        if(n==0)return 0;
        if(n==1 || n==2)return 1;
        tribonacci(0, 1, 1, n-2);
        return ans;
    }
    
    private void tribonacci(int o, int f, int s, int n){
        if(n==0)return;
        ans = o + f + s;
        tribonacci(f, s, o+f+s, n-1);
    }
}