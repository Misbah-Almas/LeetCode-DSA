class Solution {
    public int largestRectangleArea(int[] hist) {
          int n = hist.length;
          int area = 0;
          int[] pre = pre(hist, n);
          int[] next = next(hist, n);
          for(int i=0; i<n; i++){
              int curr = (next[i]-pre[i]-1)*hist[i];
              area = Math.max(area, curr);
          }
          return (int)area;
    }
    //prev smaller index array.
    public static int[] pre(int hist[], int n){
		Stack<Integer> st = new Stack<>();
		int[] arr = new int[(int)n];
		for(int i=0; i<n; i++){
			while(!st.empty() && hist[(int)st.peek()]>=hist[i]){
				st.pop();
			}
			if(st.empty()){
				arr[i] = -1;
			}else{
				arr[i] = st.peek();
			}
			st.push(i);
		}
		return arr;
	}
    //next smaller index array.
	public static int[] next(int hist[], int n){
		Stack<Integer> st = new Stack<>();
		int[] arr = new int[(int)n];
		for(int i=(int)(n-1); i>=0; i--){
			while(!st.empty() && hist[(int)st.peek()]>=hist[i]){
				st.pop();
			}
			if(st.empty()){
				arr[i] = n;
			}else{
				arr[i] = st.peek();
			}
			st.push(i);
		}
		return arr;
	}
}