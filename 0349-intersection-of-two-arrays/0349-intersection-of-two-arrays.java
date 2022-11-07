class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i : nums1){
            set.add(i);
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i : nums2){
            if(set.contains(i)){
                al.add(i);
                set.remove(i);
            }
        }
        
        int[] arr = new int[al.size()];
        
        for(int i=0; i<al.size(); i++){
            arr[i] = al.get(i);
        }
        
        return arr;
    }
}