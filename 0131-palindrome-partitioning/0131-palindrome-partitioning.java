class Solution {
    //backtracking
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(s, 0, path, res);
        return res;
    }
    
    public void dfs(String str, int s, List<String> path, List<List<String>> res){
        if(s==str.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        
        for(int i=s; i<str.length(); i++){
            if(isPlindrome(str, s, i)){
                path.add(str.substring(s, i+1));
                dfs(str, i+1, path, res);
                path.remove(path.size()-1);
            }
        }
    }
    
    public boolean isPlindrome(String str, int s, int e){
        while(s<e){
            if(str.charAt(s) != str.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
}