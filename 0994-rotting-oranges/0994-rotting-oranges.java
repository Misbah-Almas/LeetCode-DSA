class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<Tuple> q = new LinkedList<>();
        int[][] vis = new int[m][n];
        int cfresh = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==2){
                    q.add(new Tuple(i, j, 0));
                    vis[i][j] = 2;
                }
                else{
                    vis[i][j] = 0;
                }
                if(grid[i][j]==1) cfresh++;
            }
        }
        
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        int cnt = 0;
        int tm = 0;
        
        while(!q.isEmpty()){
            int row = q.peek().r;
            int col = q.peek().c;
            int time = q.peek().t;
            tm = Math.max(tm, time);
            q.poll();
            
            for(int i=0; i<4; i++){
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                
                if(nrow >= 0 && nrow <m && ncol>=0 && ncol <n
                  && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    vis[nrow][ncol] = 2;
                    q.add(new Tuple(nrow, ncol, time+1));
                    cnt++;
                }
            }
        }
       return cnt == cfresh ? tm : -1; 
    }
}
class Tuple{
    int r;
    int c;
    int t;
    
    public Tuple(int r, int c, int t){
        this.r = r;
        this.c = c;
        this.t = t;
    }
}