class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        Map<String, Boolean> used = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)==false){
                if(used.containsKey(words[i]))
                    return false;
                else{
                    map.put(ch, words[i]);
                    used.put(words[i], true);
                }
            }
            else{
                String maped = map.get(ch);
                if(maped.equals(words[i])==false)
                    return false;
            }
        }
        return true;
    }
}