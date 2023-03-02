class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    
    public void mergeSort(int[] nums, int left, int right){
        if(left<right){
            int mid = (left + right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
        return;
    }
    
    public void merge(int arr[], int left, int mid, int right){
        int i = left;
        int j = mid+1;
        int[] temp = new int[right-left+1];
        int k = 0;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=right){
            temp[k++] = arr[j++];
        }
        
        for(int z=0; z<k; z++){
            arr[left+z] = temp[z];
        }
    }
    
}