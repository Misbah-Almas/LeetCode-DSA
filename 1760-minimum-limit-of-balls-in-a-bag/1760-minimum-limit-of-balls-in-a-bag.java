class Solution {
    public int minimumSize(int[] nums, int op) {
        int l = 1;
        int r = 0;
        for(int i : nums){
         r = Math.max(r,i);
        }
        int ans=0;
        while(l<=r){
        
            int m = (l+r)/2;
            if(isValid(nums, op, m)){
                ans = m;
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }
    
    boolean isValid(int[] nums, int op, int m){
        int c=0;
        for(int i=0; i<nums.length; i++){
            c += (nums[i]-1)/m;
            
            if(c>op)
            return false;
        }
        return true;
    }
}