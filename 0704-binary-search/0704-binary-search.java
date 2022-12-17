class Solution {
    public int search(int[] arr, int key) {
        int l = 0;
		int r = arr.length-1;
		while(l<=r){
			int m = (l+r)/2;
			if(arr[m]==key)
				return m;
			else if(arr[m]>key)
				r = m-1;
			else
				l = m+1;
		}
		return -1;
    }
}