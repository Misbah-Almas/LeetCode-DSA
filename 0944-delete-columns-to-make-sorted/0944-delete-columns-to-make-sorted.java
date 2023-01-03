class Solution {
    public int minDeletionSize(String[] strs) {
        int res = 0;
        for(int c=0; c<strs[0].length(); c++){ // all corresponding char of every string of                                                   strs
            for(int r=0; r<strs.length-1; r++){ //all the string of strs
                if(strs[r].charAt(c)>strs[r+1].charAt(c))
                {
                    res++;
                break;
                }
            }
        }
        return res;
    }
}