class Solution {
    public int strStr(String haystack, String needle) {
        int hs = haystack.length();
        int nd = needle.length();
        if(hs<nd)return -1;
        for(int i=0; i<=hs-nd; i++){
            String temp = haystack.substring(i, nd+i);
            if(temp.equals(needle))
                return i;
        }
        return -1;
    }
}