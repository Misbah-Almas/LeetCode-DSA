class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]<arr[1]) return arr[0];
        if(arr[n-2]<arr[n-1]) return arr[n-1];
        int l=0;
        int r=n-1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(m>0 && m<n-1){
                if(arr[m]>arr[m-1] && arr[m]<arr[m+1])
                    return arr[m];
                else if((arr[m] == arr[m-1] && m%2==1) || (arr[m] == arr[m+1] && m%2==0)) 
                    l = m+1;
                else r = m-1;
            }
        }
        return arr[l];
    }
}