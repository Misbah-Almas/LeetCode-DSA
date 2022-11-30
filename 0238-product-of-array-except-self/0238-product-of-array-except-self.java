class Solution {
    public int[] productExceptSelf(int[] nums) {
    //prefix array concept
    int n = nums.length;
    
    int pparr[] = new int[n];
    pparr[0] = nums[0];
    for(int i = 1; i < n; i++) {
        pparr[i] = pparr[i - 1] * nums[i];
    }
    
    int sparr[] = new int[n];
    sparr[n - 1] = nums[n - 1];
    for(int i = n - 2; i >= 0; i--) {
        sparr[i] = sparr[i + 1] * nums[i];
    }
    
    int ans[] = new int[n];
    ans[0] = sparr[1]; // init first box
    ans[n - 1] = pparr[n - 2]; // init last box
    for(int i = 1; i < n - 1; i++) {
        ans[i] = pparr[i - 1] * sparr[i + 1];
    }
    
    return ans;

    }
}