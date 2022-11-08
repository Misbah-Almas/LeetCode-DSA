class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int rem=0;
        int count=0;
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for(int i=0; i<n; i++){
            sum += nums[i];
            rem = sum%k;
            if(rem<0){
                    rem = rem+k;
            }
            if(hm.containsKey(rem)){
                    count += hm.get(rem);
                    hm.put(rem, hm.get(rem)+1);
            }
            else
                    hm.put(rem, 1);
        }
        return count;
    }
}