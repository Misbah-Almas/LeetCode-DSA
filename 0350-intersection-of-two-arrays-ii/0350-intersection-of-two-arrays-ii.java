class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i : nums2){
            if(map.containsKey(i)){
                al.add(i);
                if(map.get(i)==1)
                    map.remove(i);
                else
                    map.put(i, map.get(i)-1);
            }
        }
        
        int[] arr = new int[al.size()];
        
        for(int i=0; i<al.size(); i++){
            arr[i] = al.get(i);
        }
        
        return arr;
    }
}