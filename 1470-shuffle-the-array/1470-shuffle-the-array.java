class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j=0, k=n;
        for(int i=0; i<2*n; i++){
            arr[i] = i%2==0 ? nums[j++] : nums[k++];
        }
        return arr;
    }
}