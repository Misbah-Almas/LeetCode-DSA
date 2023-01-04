class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        int rounds = 0;
        for(int i=0; i<tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1);
        }
        //Greedy Approach
        for(Integer i : map.keySet()){
            if(map.get(i)==1)return -1;
            rounds += map.get(i)/3;
            if(map.get(i)%3 != 0)
                rounds += 1;
        }
        return rounds;
    }
}