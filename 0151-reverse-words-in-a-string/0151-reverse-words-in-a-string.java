class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] sArr = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=sArr.length-1; i>=0; i--){
            sb.append(sArr[i] + " ");
        }
        return sb.toString().trim();
    }
}