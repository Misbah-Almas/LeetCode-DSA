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
    public int sumOfLeftLeaves(TreeNode root) {
        sumLeaves(root);
        return sum;
    }
    
    int sum = 0;
    private void sumLeaves(TreeNode root){
        if(root==null) return;
        
        if(root.left!=null && root.left.left==null && root.left.right==null)
            sum += root.left.val;
        
        sumLeaves(root.left);
        sumLeaves(root.right);
        
    }
}