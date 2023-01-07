class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int ans = 0;
        int sum = 0;
        for(int i=0; i<gas.length; i++){
            sum += gas[i] - cost[i];
            if(sum < 0){
                ans = i+1;
                sum = 0;
            }
            total += gas[i] - cost[i];
        }
        
        return total < 0 ? -1 : ans;
    }
}