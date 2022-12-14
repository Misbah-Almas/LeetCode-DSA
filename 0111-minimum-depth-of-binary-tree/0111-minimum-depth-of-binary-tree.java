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
    public int minDepth(TreeNode node) {
        // must take care of all the the test cases
        if(node==null) return 0;
        if(node.left==null && node.right==null)return 1;
        if(node.left==null && node.right!=null)
        return minDepth(node.right) + 1;
        if(node.left != null && node.right==null)
        return minDepth(node.left) + 1;
        
		int left = minDepth(node.left);
		int right = minDepth(node.right);
		return Math.min(left, right) + 1;
    }
}