class Solution {
    public void sortColors(int[] nums) {
        int s=0, e=nums.length-1;
        int i=0;
        while(i<=e){
           
            if(nums[i]==2){
                int temp = nums[e];
                nums[e] = nums[i];
                nums[i] = temp;
                e--;
            }
            
            else if(nums[i]==0){
                int temp = nums[s];
                nums[s] = nums[i];
                nums[i] = temp;
                s++;
                i++;
            }
            else if(nums[i]==1)i++;
            
        }
    }
}