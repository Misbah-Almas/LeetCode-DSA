class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dis1 = new int[n];
        int[] dis2 = new int[n];
        boolean[] vis = new boolean[n];
        Arrays.fill(dis1, -1);
        Arrays.fill(dis2, -1);
        dfs(node1, dis1, vis, edges, 0);
        Arrays.fill(vis, false);
        dfs(node2, dis2, vis, edges, 0);
        
        int ans = n;
        int result = -1;
        
        for(int i=0; i<n; i++){
            if(dis1[i] != -1 && dis2[i] != -1){
                int curr = Math.max(dis1[i], dis2[i]);
                if(ans > curr){
                    ans = curr;
                    result = i;
                }
            }
        }
        return result;
    }
    // dfs
    public void dfs(int node, int[] dis, boolean[] vis, int[] edges, int distance){
        if(node == -1 || vis[node] == true)return;
        vis[node]=true;
        dis[node] = distance;
        dfs(edges[node], dis, vis, edges, distance+1);
    }
}