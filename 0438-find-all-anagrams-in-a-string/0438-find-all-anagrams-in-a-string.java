class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        //frequency array approach
        
        ArrayList<Integer> arr = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        int[] sfreq = new int[26];
        int[] pfreq = new int[26];
        

        for(int i=0; i<m; i++){
            pfreq[p.charAt(i)-'a']++;
        }
        
        int start=0;
        int end=0;
        
        while(end<n){
            sfreq[s.charAt(end)-'a']++;
            
        if(end-start+1==m){
            if(Arrays.equals(sfreq, pfreq)){
                arr.add(start);
            }
            
          sfreq[s.charAt(start)-'a']--;
            start++;
        }
            end++;
        }
        
        return arr;
    }
}