class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int l = Integer.MIN_VALUE;
        int r = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            l = Math.max(l, arr[i]);
            r += arr[i];
        }
        
        while(l<=r){
            int m = l + (r-l)/2;
            if(isValid(m, arr, days)){
                ans = m;
                r = m-1;
            }
            else l = m+1;
        }
        
        return ans;
    }
    
    boolean isValid(int m, int[] arr, int days){
        int n = arr.length;
        int sum = 0;
        int count = 1;
        for(int i=0; i<n; i++){
            if(sum + arr[i] <= m){
                sum += arr[i];
            }
            else{
                sum = arr[i];
                count++;
            }
        }
        
        return count <= days;
    }
    
}