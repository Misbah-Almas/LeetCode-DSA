class Solution {
    public int findJudge(int n, int[][] trust) {
        // indegree and outdegree of vertex
        int ans = -1;
        int[] in = new int[n];
        int[] out = new int[n];
        for(int i=0; i<trust.length; i++){
            out[trust[i][0]-1]++;
            in[trust[i][1]-1]++;
        }
        for(int i=0; i<n; i++){
            if(in[i]-out[i]==n-1)
                ans = i+1;
        }
        return ans;
    }
}