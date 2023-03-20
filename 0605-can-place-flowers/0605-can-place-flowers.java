class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int ans=0;
        for(int i=0; i<f.length; i++){
           int prev = (i==0 || f[i-1]==0) ? 0 : 1;
           int next = (i==f.length-1 || f[i+1]==0) ? 0 : 1;
        
            if(prev==0 && next==0 && f[i]==0){
                ans++;
                f[i]=1;
            } 
        }
        
        return ans>=n;
    }
}