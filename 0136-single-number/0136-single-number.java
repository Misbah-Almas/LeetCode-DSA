class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i: nums){ // xor ans with whole array
            ans ^= i;
        }
        
        return ans;
    }
}