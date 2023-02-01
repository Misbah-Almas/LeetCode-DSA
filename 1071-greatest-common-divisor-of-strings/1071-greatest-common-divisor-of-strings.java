class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))return "";
        return str2.substring(0, gcd(str1.length(), str2.length()));
    }
    
    private int gcd(int x, int y){
        if(x%y==0)return y;
        return gcd(y, x%y);
    }
}