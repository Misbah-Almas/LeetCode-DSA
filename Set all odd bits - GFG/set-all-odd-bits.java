//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.setAllOddBits(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long setAllOddBits(long n){
        // code here
        int count=0;
		long temp=n;
		while(temp != 0){
			temp=temp>>1;
			count++;
		}
		for(int i=0; i<count; i+=2){
			n = n|(1<<i);
		}
		return n;
    }
}