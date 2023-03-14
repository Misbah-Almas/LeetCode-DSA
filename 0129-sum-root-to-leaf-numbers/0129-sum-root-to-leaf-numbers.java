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
    public int sumNumbers(TreeNode root) {
        int[] sum = {0};
        dfs(root, 0, sum);
        return sum[0];
    }
    
    public void dfs(TreeNode root, int par, int[] sum){
        if(root==null)return;
        root.val = par*10+root.val;
        dfs(root.left, root.val, sum);
        dfs(root.right, root.val, sum);
        if(root.left==null && root.right==null){
            sum[0] += root.val;
        }
    }
}