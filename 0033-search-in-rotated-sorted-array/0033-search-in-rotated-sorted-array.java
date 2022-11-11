class Solution {
    public int search(int[] arr, int k) {
        
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            
            int mid  = (l+r)/2;
            
            if(arr[mid]==k){
                return mid;
            }
            
            if(arr[mid]>arr[r]){
                
                if(k>=arr[l] && k < arr[mid])
                    r = mid-1;
                else
                    l = mid+1;
            }
            else{
                
                if(k>arr[mid] && k<=arr[r])
                    l = mid +1;
                else
                    r = mid-1;
            }
        }
        return -1;
    }
}