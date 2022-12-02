class Solution {
    public int equalSubstring(String s, String t, int k) {
        //equal Substring
        int n = s.length();
        int start = 0;
        int end = 0;
        int ans = 0;
        int cost = 0;

        while(end < n)
        {
            cost += Math.abs(s.charAt(end) - t.charAt(end));
            end++;

            while(start < end && cost > k) 
            {
                cost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }

            ans = Math.max(ans, end - start);
        }

        return ans;

    }
}