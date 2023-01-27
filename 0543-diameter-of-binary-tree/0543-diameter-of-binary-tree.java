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
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int height = height(root);
        return dia; //Diameter
    }
    
    public int height(TreeNode root){
        if(root==null)return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        dia = Math.max(dia, lh+rh);
        
        return Math.max(lh, rh)+1;
    }
}