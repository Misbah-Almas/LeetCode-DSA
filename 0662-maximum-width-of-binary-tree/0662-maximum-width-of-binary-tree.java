/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode rootPrime) {
        int ans=0;
        int left = 0;
        int right = 0;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(0, rootPrime));
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().ind;
            for(int i=0; i<size; i++){
                Pair pair = q.poll();
                int curr_ind = pair.ind-min;
                TreeNode root = pair.root;
                if(i==0)left = curr_ind;
                if(i==size-1)right = curr_ind;
                if(root.left != null)
                    q.add(new Pair(2*curr_ind+1, root.left));
                if(root.right != null)
                    q.add(new Pair(2*curr_ind+2, root.right));
            }
            
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
    
    class Pair{
        int ind;
        TreeNode root;
        Pair(int ind, TreeNode root){
            this.root = root;
            this.ind = ind;
        }
    }
}