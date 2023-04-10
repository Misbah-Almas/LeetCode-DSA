class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(isOpening(ch)){
                st.push(ch);
            }
            else{
                if(st.empty()){
                    return false;
                }
                else if(isSame(st.peek(), ch)){
                    st.pop();
                }
                else{
                    return false;
                }
               
            }
        }
        return st.empty() ? true : false;
    }
    
    private boolean isSame(char c1, char c2){
        if(c1=='{' && c2=='}' || c1=='[' && c2==']' || c1=='(' && c2==')')
            return true;
        return false;
    }
    
    private boolean isOpening(char ch){
        if(ch=='(' || ch=='{' || ch=='[')
            return true;
        return false;
    }
}