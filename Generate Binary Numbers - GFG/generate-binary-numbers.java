//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //Taking input using class Scanner 
        Scanner sc = new Scanner(System.in);
        
        //Taking the number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking the range
            int n = sc.nextInt();
            
            //creating an ArrayList
            ArrayList<String> res = new ArrayList<String>();
            
            //calling the generate method of class solve
            //and storing the result in an ArrayList
            res = new solve().generate(n);
            
            //printing all the elements of the ArrayList
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends




class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int n)
    {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
			int num = i;
			while(num != 0){
			String temp = num%2==0 ? "0" : "1";
		    sb.append(temp);
			num = num>>1;
		}
         //System.out.print(sb.reverse().toString() + " ");
         sb = sb.reverse();
         ans.add(sb.toString());
         sb.setLength(0);
		}
		
		return ans;
    }
    
}
