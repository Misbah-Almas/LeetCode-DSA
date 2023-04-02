class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        
        for(int i=0; i<spells.length; i++){
            int l = 0;
            int r = potions.length;
            while(l<r){
                int m = l + (r-l)/2;
                long product = potions[m]*1l*spells[i];
                if(product >= success){
                    r = m;
                }
                else{
                    l = m+1;
                }
            }
            ans[i] = potions.length - l;
        }
        
        return ans;
    }
}