class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
    int n = s.length();
    int m = p.length();
    
    int sfreq[] = new int[26];
    int pfreq[] = new int[26];
        
    List<Integer> ans = new ArrayList<>();
        
    if(m>n)
        return ans;
    
    // build your pfreq map
    for(int i = 0; i < m; i++) {
        pfreq[p.charAt(i) - 'a']++;
    }
    
    int start = 0;
    int end = 0;
    
        
    while(end < n)
    {
        sfreq[s.charAt(end) - 'a']++;
        
        // reached the box -> length condition satisfied
        // compare maps, decrease start freq and move start
        if(end - start + 1 == m) 
        {
            if(Arrays.equals(sfreq, pfreq)) ans.add(start);
            sfreq[s.charAt(start) - 'a']--;
            start++;
        }
        end++;
    }

    return ans;

        
    }
}