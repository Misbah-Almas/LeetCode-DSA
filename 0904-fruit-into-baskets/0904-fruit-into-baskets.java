class Solution {
    public int totalFruit(int[] fruits) {
        return atMax(fruits);
    }
    //Sliding Window
    private int atMax(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int max = 0;
        int s = 0, e = 0;
        while(e<n){
            map.put(arr[e], map.getOrDefault(arr[e], 0) + 1);
    
            while(map.size()>2){
                
                map.put(arr[s], map.get(arr[s])-1);
                if(map.get(arr[s])==0)
                    map.remove(arr[s]);
                s++;
            }
            
        
            max = Math.max(max, e-s+1);
            e++;
        }
        return max;
    }
}