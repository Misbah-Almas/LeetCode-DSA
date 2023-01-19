class Solution {
    public long countPairs(int n, int[][] edges) {
        
           int k = edges.length;
        // if(k==0)return fact(n-1);
        
        
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i=0; i<n; i++){
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0; i<k; i++){
			int x = edges[i][0];
			int y = edges[i][1];
			graph.get(x).add(y);
			graph.get(y).add(x);
		}

		ArrayList<Long> nodesCount = new ArrayList<>();
		boolean[] vis = new boolean[n];
        long ans = 0, sum = n;
		for(int i=0; i<n; i++){
			if(vis[i]==false){
				long curr = bfs(graph, i, vis);
				sum = sum - curr;
                ans += curr*sum;
			}
		}

		// long ans = 0;
		// for(int i=0; i<nodesCount.size(); i++){
		// 	for(int j=i+1; j<nodesCount.size(); j++){
		// 		ans += nodesCount.get(i)*nodesCount.get(j);
		// 	}
		// }
		return ans;
    }
    
    // private long fact(long n){
    //         if(n==0)return 1;
    //         return n*fact(n-1);
    //     }

	private long bfs(ArrayList<ArrayList<Integer>> graph, int x, boolean[] vis){
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		vis[x] = true;

		long count = 0;
		while(!q.isEmpty()){
			int temp = q.poll();
			count++;
			for(int i=0; i<graph.get(temp).size(); i++){
				if(!vis[graph.get(temp).get(i)]){
					q.offer(graph.get(temp).get(i));
					vis[graph.get(temp).get(i)] = true;
				}
			}
		}
		return count;
        
    }
}