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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        return height(root) != -1;
    }
    //bottom up approach...
    private int height(TreeNode root){
        if(root==null)return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        int bf = Math.abs(lh-rh);
        if(bf>1 || lh == -1 || rh == -1)return -1;
        return Math.max(lh, rh) + 1;
    }
}