class Solution {
    public boolean isPowerOfFour(int n) {
        //using bit manipulation
        if((n&(n-1))==0 && n%3==1)
            return true;
        return false;
        
    }
}