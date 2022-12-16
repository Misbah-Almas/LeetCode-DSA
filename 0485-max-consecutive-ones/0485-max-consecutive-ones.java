class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int count=0;
		int ans = 0;
		for(int i=0; i<n; i++){
			if(arr[i]==0) count=0;
			else{
				count++;
				ans = Math.max(ans, count);
			}
		}
		return ans;
    }
}