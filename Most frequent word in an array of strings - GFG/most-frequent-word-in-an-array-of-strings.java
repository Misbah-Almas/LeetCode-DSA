//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    sc.nextLine();
		    Solution obj = new Solution();
		    String arr[]=sc.nextLine().split(" ");
		    System.out.println(obj.mostFrequentWord(arr, n));
		    
		}
	}
}

// } Driver Code Ends
//User function Template for Java


class Solution
{
    //Function to find most frequent word in an array of strings.
    public String mostFrequentWord(String arr[],int n)
    {
        // code 
        int k = 1;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> order = new HashMap<>();
        for(String s : arr){
            map.put(s, map.getOrDefault(s, 0)+1);
            if(order.containsKey(s))
                continue;
            else
                order.put(s,k);
                k++;
        }
        int max = Integer.MIN_VALUE;
        String ans = "";
        for(String s : order.keySet()){
            if(max <= map.get(s)){
                if(max < map.get(s)){
                    max = map.get(s);
                    ans = s;
                }
                else if(order.get(ans)<order.get(s)){
                    ans = s;
                }
            }
        }
        return ans;
    }

}


//{ Driver Code Starts.
// } Driver Code Ends