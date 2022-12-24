class Solution {
    public int mySqrt(int x) {
        long l=1;
        long r=x;
        int ans=0;
        while(l<=r){
            long m = l + (r-l)/2;
            if((m*m)==x) return (int)m;
            if((m*m)<x){
                ans = (int)m;
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return ans;
    }
}