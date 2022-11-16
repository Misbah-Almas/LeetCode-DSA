class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<HashMap<Character, Integer>, List<String>> hm = new HashMap<>();
        
        for(String str : strs){
            HashMap<Character, Integer> key = new HashMap<>();
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                key.put(ch, key.getOrDefault(ch, 0)+1);
            }
            
            if(!hm.containsKey(key)){
                List<String> l1 = new ArrayList<>();
                l1.add(str);
                hm.put(key, l1);
            }
            else{
                List<String> temp = hm.get(key);
                temp.add(str);
                hm.put(key, temp);
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        for(List<String> temp : hm.values()){
            
            ans.add(temp);
        }
        
        return ans;
    }
}