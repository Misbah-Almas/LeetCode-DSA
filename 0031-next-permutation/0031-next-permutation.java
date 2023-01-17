class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int infpt = 0; // point about which swap will occur to get next permutaion
        //reverse loop to get just next permutation
        for(int i=n-1; i>0; i--){
            if(nums[i]>nums[i-1])
            {
                infpt = i;
            break;
            }
        }
        
        if(infpt==0){ //means there is no next permutaion
            Arrays.sort(nums);
        }else{
            int toswap = nums[infpt-1];
            int nextInd = infpt;
            int mindiff = Integer.MAX_VALUE;
            for(int j=infpt; j<n; j++){
                if(nums[j]>toswap && nums[j]-toswap<mindiff){
                    nextInd = j;
                    mindiff = Math.min(mindiff, nums[j]-toswap);
                }
            }
            int temp = nums[infpt-1];
            nums[infpt-1] = nums[nextInd];
            nums[nextInd] = temp;
            Arrays.sort(nums, infpt, n);
        }
    }
}