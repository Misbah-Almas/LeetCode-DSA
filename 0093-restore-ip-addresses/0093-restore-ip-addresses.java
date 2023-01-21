class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        helper(s, 0, 0, "", res);
        return res;
    }

    private void helper(String s, int i, int par, String ans, List<String> res){
        if(i==s.length() || par==4){ // boundary condition
            if(i==s.length() && par==4){ // adding to list when hit this condition
                res.add(ans.substring(0, ans.length()-1));
            }
            return;
        }
        helper(s, i+1, par+1, ans+s.charAt(i)+".", res); // for each char of length 1
        
        if(i+2<=s.length() && isValid(s.substring(i, i+2))){ // for each char of length 2
            helper(s, i+2, par+1, ans+s.substring(i, i+2)+".", res);
        }
        
        if(i+3<=s.length() && isValid(s.substring(i, i+3))){ // for each char of length 3
            helper(s, i+3, par+1, ans+s.substring(i, i+3)+".", res);
        }
        
        return;
    }
    
    private boolean isValid(String s){
        if(s.charAt(0)=='0' || Integer.parseInt(s)>255)
            return false;
        return true;
    }
}