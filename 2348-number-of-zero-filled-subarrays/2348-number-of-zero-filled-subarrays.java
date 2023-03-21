class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0; int subArrayEndWithZero = 0;
        for(int i : nums){
            if(i==0){
                count += ++subArrayEndWithZero;
            }
            else{
                subArrayEndWithZero = 0;
            }
        }
        return count;
    }
}