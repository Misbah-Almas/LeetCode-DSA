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
    long total = 0;
	long max = Long.MIN_VALUE;
	long mod = 1000000007;

    public int maxProduct(TreeNode root) {
        //Write your code
		total = sum(root);
		traverse(root);
		return (int)(max%mod);
    }
	private void traverse(TreeNode root){
		if(root==null)return;
		int curr = root.val;
		max = Math.max(max, curr*(total-curr));
		traverse(root.left);
		traverse(root.right);
		return;
	}

	private int sum(TreeNode root){
		if(root==null) return 0;
		int left = sum(root.left);
		int right = sum(root.right);
		root.val += (left + right);
		return root.val;
	}
}