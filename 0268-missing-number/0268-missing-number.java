class Solution {
    public int missingNumber(int[] nums) {
        int xorarr=0;
        for(int i : nums){
            xorarr ^= i;
        }
        
        int xorall = 0;
        for(int i=0; i<=nums.length; i++){
            xorall ^= i;
        }
        
        return xorarr ^ xorall;
    }
}