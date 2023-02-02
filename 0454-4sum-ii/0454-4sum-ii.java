class Solution {
    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<c.length; i++){
            for(int j=0; j<d.length; j++){
                int s = c[i] + d[j];
                map.put(s, map.getOrDefault(s, 0)+1);
            }
        }
        
        int ans = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                ans += map.getOrDefault(-1*(a[i]+b[j]), 0);
            }
        }
        
        return ans;
    }
}