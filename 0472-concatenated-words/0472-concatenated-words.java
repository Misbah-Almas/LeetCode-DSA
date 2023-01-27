class Solution {
    Set<String> chache = new HashSet<>();
    int min = 0;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> set = new HashSet<>();
        for(String word : words){
            set.add(word);
            min = Math.min(min, word.length());
        }
        List<String> res = new ArrayList<>();
        
        for(String word : words){
            if(canForm(word, set)){
                res.add(word);
            }
        }
        
        return res;
    }
    
    public boolean canForm(String word, Set<String> set){
        
        if(chache.contains(word))return true; //Dp..
        
        for(int i=min; i<word.length()-min; i++){
            String left = word.substring(0, i);
            String right = word.substring(i);
            if(set.contains(left)){
                if(set.contains(right) || canForm(right, set)){
                    chache.add(word);
                    return true;
                }
            }
        }
        return false;
    }
}