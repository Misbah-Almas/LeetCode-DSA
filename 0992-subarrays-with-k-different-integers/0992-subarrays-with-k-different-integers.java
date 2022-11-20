class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        //At most k - At most k-1 == exatct k Distinct
        return atMostKDistinct(nums, k)-atMostKDistinct(nums, k-1);
    }
    
    public int atMostKDistinct(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int count=0;
        while(end<nums.length){
            map.put(nums[end], map.getOrDefault(nums[end], 0)+1);
            while(map.size()>k){
                if(map.get(nums[start])==1)
                    map.remove(nums[start]);
                else
                    map.put(nums[start], map.get(nums[start])-1);
                start++;
            }
            
            count += end-start+1;
            end++;
        }
        
        return count;
    }
}