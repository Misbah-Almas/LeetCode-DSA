class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int l = 1;
        int r = -1;
        for(int i : piles){
            r = Math.max(r, i);
        }
        while(l<r){
            int m = l + (r-l)/2;
            if(check(piles, h, m)){
                r = m;
            }
            else l = m+1;
        }
        return l;
    }
    
    private boolean check(int[] piles, int h, int m){
        long hr = 0;
        for(int i=0; i<piles.length; i++){
            hr += piles[i]/m + (piles[i]%m==0 ? 0 : 1);
        }
        return hr<=h;
    }
}